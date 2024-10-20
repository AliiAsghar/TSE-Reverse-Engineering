package defpackage;

import java.io.FileOutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class eir extends arpw implements arqr {
    Object a;
    Object b;
    int c;
    final /* synthetic */ Object d;
    final /* synthetic */ eil e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eir(eil eilVar, Object obj, arpe arpeVar) {
        super(1, arpeVar);
        this.e = eilVar;
        this.d = obj;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new eir(this.e, this.d, (arpe) obj).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Object obj2;
        arpl arplVar = arpl.a;
        ?? r1 = this.c;
        try {
            if (r1 != 0) {
                obj2 = this.b;
                Object obj3 = this.a;
                aqil.P(obj);
                r1 = obj3;
            } else {
                aqil.P(obj);
                FileOutputStream fileOutputStream = new FileOutputStream(this.e.a);
                Object obj4 = this.d;
                ejd ejdVar = new ejd(fileOutputStream);
                this.a = fileOutputStream;
                this.b = fileOutputStream;
                this.c = 1;
                ((apbt) obj4).writeTo(ejdVar);
                if (arnb.a != arplVar) {
                    obj2 = fileOutputStream;
                    r1 = fileOutputStream;
                } else {
                    return arplVar;
                }
            }
            ((FileOutputStream) obj2).getFD().sync();
            armd.i(r1, null);
            return arnb.a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                armd.i(r1, th);
                throw th2;
            }
        }
    }
}
