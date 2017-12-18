package com.example.rx.files;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.schedulers.Schedulers;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RxFileReader {


    void read(String fileName) throws FileNotFoundException {
        Flowable.create((FlowableEmitter<String> emitter) -> {
            try {
                FileReader reader = new FileReader("test.txt");
                BufferedReader br = new BufferedReader(reader);

                String str;
                while ((str = br.readLine()) != null && !emitter.isCancelled()) {
                    while (emitter.requested() == 0) {
                        if (emitter.isCancelled()) {
                            break;
                        }
                    }
                    emitter.onNext(str);
                }

                br.close();
                reader.close();

                emitter.onComplete();
            } catch (Exception e) {
                emitter.onError(e);
            }
        }, BackpressureStrategy.ERROR)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.newThread())
                .subscribe(new Subscriber<String>() {
                    @Override
                    public void onSubscribe(Subscription subscription) {

                    }

                    @Override
                    public void onNext(String s) {

                    }

                    @Override
                    public void onError(Throwable throwable) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

}
