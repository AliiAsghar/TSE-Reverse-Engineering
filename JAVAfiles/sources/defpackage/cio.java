package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cio extends arrp implements arqr<FocusTargetNode, Boolean> {
    final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cio(int i) {
        super(1);
        this.a = i;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        boolean z;
        Boolean c = cjd.c((FocusTargetNode) obj, this.a);
        if (c != null) {
            z = c.booleanValue();
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
