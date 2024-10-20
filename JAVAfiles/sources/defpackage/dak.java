package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dak extends arrp implements arqr<FocusTargetNode, Boolean> {
    final /* synthetic */ cib a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dak(cib cibVar) {
        super(1);
        this.a = cibVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        boolean z;
        Boolean c = cjd.c((FocusTargetNode) obj, this.a.a);
        if (c != null) {
            z = c.booleanValue();
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
