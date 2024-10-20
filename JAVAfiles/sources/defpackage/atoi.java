package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atoi {
    private static atoi b;
    public final Object a;

    public atoi() {
        this.a = "0123456789ABCDEFGHIJKLMNOPQRSTUV=";
    }

    public static synchronized atoi f() {
        atoi atoiVar;
        synchronized (atoi.class) {
            if (b == null) {
                b = new atoi(null, null, null, null);
            }
            atoiVar = b;
        }
        return atoiVar;
    }

    public final arve a(int i) {
        return ((arve[]) this.a)[i];
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [arhs, java.lang.Object] */
    public final arhu b() {
        return new arhu(this.a);
    }

    public final long c(long j) {
        return ((AtomicLong) this.a).addAndGet(j);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    public final synchronized List d() {
        return this.a;
    }

    public final synchronized void e() {
    }

    public atoi(Object obj) {
        this.a = obj;
    }

    public atoi(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = Collections.emptyList();
    }

    public atoi(char[] cArr, byte[] bArr) {
        this.a = new AtomicLong();
    }

    public atoi(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new LinkedHashMap();
    }

    public atoi(char[] cArr) {
        this.a = new ArrayList(20);
    }

    public atoi(int i) {
        arve[] arveVarArr = new arve[i];
        for (int i2 = 0; i2 < i; i2++) {
            arveVarArr[i2] = new arve(null, arvf.a);
        }
        this.a = arveVarArr;
    }

    public atoi(atar atarVar, byte[][] bArr) {
        if (!atow.ai(bArr)) {
            if (bArr.length == atarVar.b) {
                for (byte[] bArr2 : bArr) {
                    if (bArr2.length != atarVar.a) {
                        throw new IllegalArgumentException("wrong publicKey format");
                    }
                }
                this.a = atow.ao(bArr);
                return;
            }
            throw new IllegalArgumentException("wrong publicKey size");
        }
        throw new NullPointerException("publicKey byte array == null");
    }
}
