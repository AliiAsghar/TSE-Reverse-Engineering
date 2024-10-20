package com.google.common.util.concurrent;

import defpackage.ance;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class SettableFuture<V> extends ance.i<V> {
    private SettableFuture() {
    }

    public static <V> SettableFuture<V> create() {
        return new SettableFuture<>();
    }

    @Override // defpackage.ance
    public boolean set(V v) {
        return super.set(v);
    }

    @Override // defpackage.ance
    public boolean setException(Throwable th) {
        return super.setException(th);
    }
}
