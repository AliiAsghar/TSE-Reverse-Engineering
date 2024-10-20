package defpackage;

import android.content.Context;
import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezs {
    final Context a;
    public eti b;
    final alhr c;
    public alhr d;
    public alhr e;
    public alhr f;
    final alhr g;
    final algk h;
    public Looper i;
    final int j;
    final epz k;
    final int l;
    final boolean m;
    final fbi n;
    final long o;
    final long p;
    final long q;
    public long r;
    final long s;
    public boolean t;
    public boolean u;
    final String v;
    final ezj w;

    public ezs(Context context, alhr alhrVar, alhr alhrVar2) {
        ezp ezpVar = new ezp(context, 6);
        int i = 0;
        ezq ezqVar = new ezq(i);
        ezp ezpVar2 = new ezp(context, 7);
        ezr ezrVar = new ezr(i);
        dzg.g(context);
        this.a = context;
        this.c = alhrVar;
        this.d = alhrVar2;
        this.e = ezpVar;
        this.f = ezqVar;
        this.g = ezpVar2;
        this.h = ezrVar;
        this.i = eul.E();
        this.k = epz.a;
        this.l = 1;
        this.m = true;
        this.n = fbi.b;
        this.o = 5000L;
        this.p = 15000L;
        this.q = 3000L;
        this.w = new ezj(eul.u(20L), eul.u(500L));
        this.b = eti.a;
        this.r = 500L;
        this.s = 2000L;
        this.t = true;
        this.v = "";
        this.j = -1000;
    }

    public final ExoPlayer a() {
        dzg.d(!this.u);
        this.u = true;
        int i = eul.a;
        return new fad(this);
    }
}
