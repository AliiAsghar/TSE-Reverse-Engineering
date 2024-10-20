package io.grpc;

import defpackage.a;
import defpackage.albo;
import defpackage.algv;
import defpackage.aquo;
import defpackage.aqur;
import defpackage.aqus;
import defpackage.aqut;
import defpackage.aqvy;
import defpackage.aqvz;
import defpackage.aqwb;
import defpackage.d;
import j$.util.DesugarCollections;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class Status {
    public static final List a;
    public static final Status b;
    public static final Status c;
    public static final Status d;
    public static final Status e;
    public static final Status f;
    public static final Status g;
    public static final Status h;
    public static final Status i;
    public static final Status j;
    public static final Status k;
    public static final Status l;
    public static final Status m;
    public static final Status n;
    public static final Status o;
    public static final aquo p;
    public static final aquo q;
    private static final aqus s;
    public final Throwable r;
    private final Code t;
    private final String u;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public enum Code {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);

        public final byte[] r;
        private final int t;

        Code(int i) {
            this.t = i;
            this.r = Integer.toString(i).getBytes(StandardCharsets.US_ASCII);
        }

        public final Status a() {
            return (Status) Status.a.get(this.t);
        }

        public int value() {
            return this.t;
        }
    }

    static {
        TreeMap treeMap = new TreeMap();
        for (Code code : Code.values()) {
            Status status = (Status) treeMap.put(Integer.valueOf(code.value()), new Status(code, null, null));
            if (status != null) {
                throw new IllegalStateException("Code value duplication between " + status.getCode().name() + " & " + code.name());
            }
        }
        a = DesugarCollections.unmodifiableList(new ArrayList(treeMap.values()));
        b = Code.OK.a();
        c = Code.CANCELLED.a();
        d = Code.UNKNOWN.a();
        e = Code.INVALID_ARGUMENT.a();
        f = Code.DEADLINE_EXCEEDED.a();
        g = Code.NOT_FOUND.a();
        Code.ALREADY_EXISTS.a();
        h = Code.PERMISSION_DENIED.a();
        i = Code.UNAUTHENTICATED.a();
        j = Code.RESOURCE_EXHAUSTED.a();
        k = Code.FAILED_PRECONDITION.a();
        Code.ABORTED.a();
        Code.OUT_OF_RANGE.a();
        l = Code.UNIMPLEMENTED.a();
        m = Code.INTERNAL.a();
        n = Code.UNAVAILABLE.a();
        o = Code.DATA_LOSS.a();
        p = new aqur("grpc-status", false, new aqvy());
        aqvz aqvzVar = new aqvz();
        s = aqvzVar;
        q = new aqur("grpc-message", false, aqvzVar);
    }

    private Status(Code code, String str, Throwable th) {
        code.getClass();
        this.t = code;
        this.u = str;
        this.r = th;
    }

    public static aqut a(Throwable th) {
        th.getClass();
        while (th != null) {
            if (th instanceof StatusException) {
                return ((StatusException) th).b;
            }
            if (th instanceof aqwb) {
                return ((aqwb) th).b;
            }
            th = th.getCause();
        }
        return null;
    }

    public static Status c(Throwable th) {
        th.getClass();
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof StatusException) {
                return ((StatusException) th2).a;
            }
            if (th2 instanceof aqwb) {
                return ((aqwb) th2).a;
            }
        }
        return d.d(th);
    }

    public static String e(Status status) {
        if (status.u == null) {
            return status.t.toString();
        }
        return status.t.toString() + ": " + status.u;
    }

    public static Status fromCodeValue(int i2) {
        if (i2 >= 0) {
            List list = a;
            if (i2 < list.size()) {
                return (Status) list.get(i2);
            }
        }
        return d.withDescription(a.bV(i2, "Unknown code "));
    }

    public StatusException asException() {
        return new StatusException(this);
    }

    public final Status b(String str) {
        String str2 = this.u;
        if (str2 == null) {
            return new Status(this.t, str, this.r);
        }
        return new Status(this.t, a.co(str, str2, "\n"), this.r);
    }

    public final Status d(Throwable th) {
        if (d.B(this.r, th)) {
            return this;
        }
        return new Status(this.t, this.u, th);
    }

    public final boolean f() {
        if (Code.OK == this.t) {
            return true;
        }
        return false;
    }

    public Code getCode() {
        return this.t;
    }

    public String getDescription() {
        return this.u;
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("code", this.t.name());
        aj.b("description", this.u);
        Throwable th = this.r;
        Object obj = th;
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            obj = stringWriter.toString();
        }
        aj.b("cause", obj);
        return aj.toString();
    }

    public Status withDescription(String str) {
        if (d.B(this.u, str)) {
            return this;
        }
        return new Status(this.t, str, this.r);
    }
}
