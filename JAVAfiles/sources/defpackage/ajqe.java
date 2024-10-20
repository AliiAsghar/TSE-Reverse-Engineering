package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajqe {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public ajqe() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [alhr, java.lang.Object] */
    public final ahta a() {
        this.d.getClass();
        if (this.a == null) {
            this.a = ahta.c;
        }
        if (this.f == null) {
            this.f = ahta.c((Context) this.d);
        }
        int i = 1;
        if (this.b == null) {
            this.b = new ahsz(this, i);
        }
        int i2 = 0;
        if (this.e == null) {
            Object obj = this.d;
            ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, new aiuy(new aohs((Context) obj, (byte[]) null)), new aivb());
            this.e = albo.D(new agud(arrayList, 20));
        }
        if (this.c == null) {
            this.c = new ahsz(this, i2);
        }
        return new ahta((Context) this.d, this.a, this.f, this.b, this.e, this.c);
    }

    public ajqe(char[] cArr) {
    }

    public ajqe(byte[] bArr) {
        this.c = Optional.empty();
        this.e = Optional.empty();
        this.f = Optional.empty();
    }
}
