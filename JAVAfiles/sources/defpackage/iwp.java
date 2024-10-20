package defpackage;

import android.widget.EditText;
import com.google.android.apps.messaging.ui.common.BugleSearchView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iwp implements oy {
    final /* synthetic */ BugleSearchView a;
    final /* synthetic */ ixd b;

    public iwp(ixd ixdVar, BugleSearchView bugleSearchView) {
        this.a = bugleSearchView;
        this.b = ixdVar;
    }

    @Override // defpackage.oy
    public final boolean a(String str) {
        return false;
    }

    @Override // defpackage.oy
    public final void b(String str) {
        wfh wfhVar = this.b.dd;
        EditText searchTextView = this.a.getSearchTextView();
        if (wfhVar.A() && searchTextView != null) {
            if (ytd.i(str, null)) {
                searchTextView.setLayoutDirection(0);
                searchTextView.setTextDirection(3);
                searchTextView.setTextAlignment(3);
            } else {
                searchTextView.setLayoutDirection(2);
                searchTextView.setTextDirection(0);
                searchTextView.setTextAlignment(0);
            }
        }
        ixd ixdVar = this.b;
        ixdVar.bP = str;
        da daVar = ixdVar.M.B;
        if (((Boolean) aaer.a.e()).booleanValue() && (daVar == null || daVar.ab())) {
            return;
        }
        ixd ixdVar2 = this.b;
        ixdVar2.aF.ifPresent(new ivp(this, 17));
    }
}
