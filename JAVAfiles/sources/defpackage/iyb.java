package defpackage;

import android.animation.AnimatorSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iyb extends arsm {
    final /* synthetic */ iyc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyb(Object obj, iyc iycVar) {
        super(obj);
        this.a = iycVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        ixy ixyVar = (ixy) obj2;
        ixy ixyVar2 = (ixy) obj;
        iyc iycVar = this.a;
        iycVar.e();
        if (iycVar.b.isShown()) {
            if ((ixyVar2 instanceof ixw) && (ixyVar instanceof ixw)) {
                iycVar.d.setText(iycVar.d((ixw) ixyVar));
                iycVar.f();
            } else {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(iycVar.b(), iycVar.a());
                animatorSet.start();
            }
        }
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
