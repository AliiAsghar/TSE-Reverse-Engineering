package defpackage;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.ShareActionProvider;
import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pf implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public pf(ShareActionProvider shareActionProvider, int i) {
        this.b = i;
        this.a = shareActionProvider;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    airg airgVar = (airg) this.a;
                    airgVar.e();
                    airgVar.d.requestFocus();
                    aodc aodcVar = aodc.SEARCH_ICON;
                    aozy createBuilder = aodd.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    ((aodd) apagVar).b = aode.a(20);
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    airh airhVar = airgVar.k;
                    ((aodd) createBuilder.b).e = aodcVar.a();
                    airhVar.a((aodd) createBuilder.s());
                    return true;
                }
                String str = (String) yig.s.e();
                zme zmeVar = (zme) this.a;
                ((lzv) zmeVar.b).y((Context) zmeVar.a, str);
                return true;
            }
            ixd ixdVar = (ixd) this.a;
            abav abavVar = (abav) ixdVar.bc.b();
            if (!((Boolean) abav.a.e()).booleanValue()) {
                ((mbl) abavVar.b.b()).e("Bugle.Search.Button.Clicked", 1);
            }
            ixdVar.Z.a();
            return false;
        }
        ShareActionProvider shareActionProvider = (ShareActionProvider) this.a;
        Intent b = jz.e(shareActionProvider.mContext, shareActionProvider.mShareHistoryFileName).b(menuItem.getItemId());
        if (b != null) {
            String action = b.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                ((ShareActionProvider) this.a).updateIntent(b);
            }
            ((ShareActionProvider) this.a).mContext.startActivity(b);
        }
        return true;
    }

    public /* synthetic */ pf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
