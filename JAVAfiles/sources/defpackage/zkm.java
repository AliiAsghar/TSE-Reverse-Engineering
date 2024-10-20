package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zkm {
    public final Object a;
    public final Object b;
    public final Object c;

    public zkm(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public static /* synthetic */ alpt d(Cursor cursor) {
        cursor.getClass();
        alpr alprVar = new alpr();
        while (cursor.moveToNext()) {
            alprVar.c(new aapm(cursor.getString(0), cursor.getInt(1), cursor.getString(2)));
        }
        return alprVar.g();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Iterable] */
    public static final List f(String str, arqr arqrVar) {
        abac abacVar = new abac(str);
        arqrVar.a(abacVar);
        return aqjn.ax(abacVar.a);
    }

    public final akuk a(long j, String str, String[] strArr) {
        String bW = a.bW(str, "contact_id=? AND mimetype='", "'");
        String[] strArr2 = {String.valueOf(j)};
        return new akuk(((atsg) this.a).h(ContactsContract.Data.CONTENT_URI, strArr, bW, strArr2, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul b(akul akulVar) {
        return akulVar.f(Throwable.class, new aang(this, 12), this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul c(Uri uri) {
        int i = 10;
        final akul f = new akuk(((atsg) this.a).h(uri, new String[]{"_id", "display_name"}, null, null, null)).d(new lfg(i), this.b).f();
        final akul i2 = f.i(new aang(this, 13), this.b);
        final akul i3 = f.i(new aang(this, 14), this.b);
        final akul i4 = f.i(new aang(this, 6), this.b);
        final akul i5 = f.i(new aang(this, 7), this.b);
        final akul i6 = f.i(new aang(this, 8), this.b);
        final akul i7 = f.i(new aang(this, 9), this.b);
        final akul i8 = f.i(new aang(this, i), this.b);
        final akul i9 = f.i(new aang(this, 11), this.b);
        return aktp.an(i2, i3, i4, i5, i6, i7, i8, i9).h(new Callable() { // from class: aapr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                try {
                    aaps aapsVar = (aaps) albo.bQ(akul.this);
                    akul akulVar = i2;
                    String str = aapsVar.b;
                    alpt alptVar = (alpt) albo.bQ(akulVar);
                    if (alptVar != null) {
                        alpt alptVar2 = (alpt) albo.bQ(i3);
                        if (alptVar2 != null) {
                            alpt alptVar3 = (alpt) albo.bQ(i4);
                            if (alptVar3 != null) {
                                alpt alptVar4 = (alpt) albo.bQ(i5);
                                if (alptVar4 != null) {
                                    alpt alptVar5 = (alpt) albo.bQ(i6);
                                    if (alptVar5 != null) {
                                        alpt alptVar6 = (alpt) albo.bQ(i7);
                                        if (alptVar6 != null) {
                                            alpt alptVar7 = (alpt) albo.bQ(i8);
                                            if (alptVar7 != null) {
                                                alpt alptVar8 = (alpt) albo.bQ(i9);
                                                if (alptVar8 != null) {
                                                    return new aapn(str, alptVar, alptVar2, alptVar3, alptVar4, alptVar5, alptVar6, alptVar7, alptVar8);
                                                }
                                                throw new NullPointerException("Null notes");
                                            }
                                            throw new NullPointerException("Null events");
                                        }
                                        throw new NullPointerException("Null websites");
                                    }
                                    throw new NullPointerException("Null organizations");
                                }
                                throw new NullPointerException("Null ims");
                            }
                            throw new NullPointerException("Null addresses");
                        }
                        throw new NullPointerException("Null emails");
                    }
                    throw new NullPointerException("Null phones");
                } catch (ExecutionException unused) {
                    return null;
                }
            }
        }, this.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r7v2, types: [arpi, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.arpe r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.aaod
            if (r0 == 0) goto L13
            r0 = r7
            aaod r0 = (defpackage.aaod) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aaod r0 = new aaod
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            zkm r0 = r0.d
            defpackage.aqil.P(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            defpackage.aqil.P(r7)
            java.lang.Object r7 = r6.b
            aanv r2 = new aanv
            r4 = 0
            r5 = 3
            r2.<init>(r6, r4, r5)
            r0.d = r6
            r0.b = r3
            java.lang.Object r7 = defpackage.arro.q(r7, r2, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            r0 = r6
        L49:
            java.lang.Object r7 = r0.c
            android.content.Context r7 = (android.content.Context) r7
            java.lang.String r0 = "Inserted successfully"
            r1 = 0
            android.widget.Toast r7 = android.widget.Toast.makeText(r7, r0, r1)
            r7.show()
            arnb r7 = defpackage.arnb.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zkm.e(arpe):java.lang.Object");
    }

    public zkm(anen anenVar, uac uacVar, ndi ndiVar) {
        anenVar.getClass();
        uacVar.getClass();
        ndiVar.getClass();
        this.c = anenVar;
        this.a = uacVar;
        this.b = ndiVar;
    }

    public zkm(agnw agnwVar, Context context, arpi arpiVar) {
        agnwVar.getClass();
        context.getClass();
        arpiVar.getClass();
        this.a = agnwVar;
        this.c = context;
        this.b = arpiVar;
    }
}
