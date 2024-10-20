package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jtm implements aflj {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public jtm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [arwe, java.lang.Object] */
    @Override // defpackage.aflj
    public final void a(String str) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                str.getClass();
                if (((AtomicBoolean) ((mgu) this.a).d).compareAndSet(false, true)) {
                    ljn.d((ljn) ((mgu) this.a).f.b(), 13, 0, 0, 6);
                }
                mgu mguVar = (mgu) this.a;
                qjh.l(mguVar.i, null, new kca(str, mguVar, (arpe) null, 13), 3);
                return;
            }
            str.getClass();
            if (str.length() == 0) {
                str = null;
            }
            ((jxv) ((mgu) this.a).b).e(new ipk(str, 11));
            return;
        }
        str.getClass();
        jto jtoVar = (jto) this.a;
        qjh.l(jtoVar.c, null, new jtl(jtoVar, str, null), 3);
    }
}
