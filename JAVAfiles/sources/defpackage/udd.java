package defpackage;

import android.content.ContentValues;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class udd {
    public alhr a;
    public agnw b;
    public alhr c;
    public AtomicInteger d;
    public AtomicLong e;
    public AtomicLong f;
    public AtomicBoolean g;
    public String h;
    public ContentValues i;
    public agoz j;
    private agni k;
    private udf l;
    private boolean m;
    private byte n;

    public final ude a() {
        agni agniVar;
        udf udfVar;
        agnw agnwVar;
        alhr alhrVar;
        AtomicInteger atomicInteger;
        AtomicLong atomicLong;
        AtomicLong atomicLong2;
        AtomicBoolean atomicBoolean;
        if (this.n == 1 && (agniVar = this.k) != null && (udfVar = this.l) != null && (agnwVar = this.b) != null && (alhrVar = this.c) != null && (atomicInteger = this.d) != null && (atomicLong = this.e) != null && (atomicLong2 = this.f) != null && (atomicBoolean = this.g) != null) {
            return new ude(agniVar, udfVar, this.a, agnwVar, this.m, alhrVar, atomicInteger, atomicLong, atomicLong2, atomicBoolean, this.h, this.i, this.j);
        }
        StringBuilder sb = new StringBuilder();
        if (this.k == null) {
            sb.append(" loggingTag");
        }
        if (this.l == null) {
            sb.append(" operationCategory");
        }
        if (this.b == null) {
            sb.append(" database");
        }
        if (this.n == 0) {
            sb.append(" exemptFromQueryPlanChecking");
        }
        if (this.c == null) {
            sb.append(" sqlAndArgs");
        }
        if (this.d == null) {
            sb.append(" resultCount");
        }
        if (this.e == null) {
            sb.append(" threadTimeMillis");
        }
        if (this.f == null) {
            sb.append(" elapsedTimeMillis");
        }
        if (this.g == null) {
            sb.append(" isInFlight");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.m = z;
        this.n = (byte) 1;
    }

    public final void c(agni agniVar) {
        if (agniVar != null) {
            this.k = agniVar;
            return;
        }
        throw new NullPointerException("Null loggingTag");
    }

    public final void d(udf udfVar) {
        if (udfVar != null) {
            this.l = udfVar;
            return;
        }
        throw new NullPointerException("Null operationCategory");
    }
}
