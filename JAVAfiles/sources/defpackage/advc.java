package defpackage;

import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class advc {
    public final advb a;
    public final Executor b;
    public final boolean c;
    public final Object d;
    public final Function e;

    public advc() {
        throw null;
    }

    public static ajqh a(advb advbVar, Executor executor) {
        ajqh ajqhVar = new ajqh((char[]) null);
        ajqhVar.c = advbVar;
        if (executor != null) {
            ajqhVar.b = executor;
            ajqhVar.h(advbVar);
            ajqhVar.i(true);
            return ajqhVar;
        }
        throw new NullPointerException("Null executor");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.advc
            r2 = 0
            if (r1 == 0) goto L40
            advc r5 = (defpackage.advc) r5
            advb r1 = r4.a
            advb r3 = r5.a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L40
            java.util.concurrent.Executor r1 = r4.b
            java.util.concurrent.Executor r3 = r5.b
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L40
            boolean r1 = r4.c
            boolean r3 = r5.c
            if (r1 != r3) goto L40
            java.lang.Object r1 = r4.d
            java.lang.Object r3 = r5.d
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L40
            java.util.function.Function r1 = r4.e
            java.util.function.Function r5 = r5.e
            if (r1 != 0) goto L38
            if (r5 != 0) goto L40
            goto L3f
        L38:
            boolean r5 = defpackage.d$$ExternalSyntheticApiModelOutline0.m335m(r1, r5)
            if (r5 != 0) goto L3f
            goto L40
        L3f:
            return r0
        L40:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.advc.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode;
        int hashCode2 = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        int hashCode3 = (((hashCode2 * 1000003) ^ i) * 1000003) ^ this.d.hashCode();
        Function function = this.e;
        if (function != null) {
            hashCode = function.hashCode();
        } else {
            hashCode = 0;
        }
        return (hashCode3 * 1000003) ^ hashCode;
    }

    public final String toString() {
        Function function = this.e;
        Object obj = this.d;
        Executor executor = this.b;
        return "ObserverWrapper{observer=" + String.valueOf(this.a) + ", executor=" + String.valueOf(executor) + ", notifyOnAdd=" + this.c + ", identifier=" + String.valueOf(obj) + ", filter=" + String.valueOf(function) + "}";
    }

    public advc(advb advbVar, Executor executor, boolean z, Object obj, Function function) {
        this.a = advbVar;
        this.b = executor;
        this.c = z;
        this.d = obj;
        this.e = function;
    }
}
