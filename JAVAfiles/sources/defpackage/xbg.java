package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xbg {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/sms/config/MmsConfigMap");
    public final xbe c;
    public boolean f;
    public Optional g;
    public final yjy h;
    public final znj i;
    private final Optional j;
    public final Lock b = new ReentrantLock();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();

    public xbg(yjy yjyVar, Optional optional, znj znjVar) {
        new AtomicBoolean(false);
        this.f = false;
        this.g = Optional.empty();
        this.h = yjyVar;
        this.j = optional;
        this.c = new xbe(-1, new Bundle());
        this.i = znjVar;
    }

    public final Bundle a(int i) {
        Bundle bundle;
        this.b.lock();
        try {
            xbe xbeVar = (xbe) this.e.get(i);
            if (xbeVar == null) {
                bundle = Bundle.EMPTY;
            } else {
                bundle = new Bundle(xbeVar.b);
            }
            return bundle;
        } finally {
            this.b.unlock();
        }
    }

    public final void b() {
        this.b.lock();
        try {
            int size = this.e.size();
            for (int i = 0; i < size; i++) {
                xbe xbeVar = (xbe) this.e.valueAt(i);
                int i2 = xbeVar.a;
                xbe xbeVar2 = (xbe) this.d.get(i2);
                if (xbeVar2 != null) {
                    if (xbeVar.i().isPresent()) {
                        xbeVar.c = xbd.a(i2, (String) xbeVar.i().get(), this.h);
                    }
                    if (this.i.W()) {
                        xbeVar2.b.putAll(xbeVar.b);
                        xbd xbdVar = xbeVar.c;
                        if (xbdVar != null) {
                            xbeVar2.c = xbdVar;
                        }
                        this.d.put(i2, xbeVar2);
                    }
                }
            }
        } finally {
            this.b.unlock();
        }
    }

    public final void c() {
        this.j.ifPresent(new vrw(20));
    }
}
