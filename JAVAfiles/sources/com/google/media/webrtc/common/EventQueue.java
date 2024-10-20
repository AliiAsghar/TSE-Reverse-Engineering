package com.google.media.webrtc.common;

import defpackage.aomp;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class EventQueue<T> {
    private final ConcurrentHashMap a = new ConcurrentHashMap();

    public void produce(T t) {
        for (Map.Entry entry : this.a.entrySet()) {
            ((Executor) entry.getValue()).execute(new aomp(entry, 2));
        }
    }
}
