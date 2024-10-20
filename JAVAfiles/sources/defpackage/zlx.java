package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryBrowserActivity;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zlx implements ActionMode.Callback {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public zlx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                int itemId = menuItem.getItemId();
                if (itemId == R.id.action_attach) {
                    aktp.K(new aarx(), (cg) ((zmn) this.a).b);
                    return true;
                }
                if (itemId != 16908332) {
                    return false;
                }
                return ((zmn) this.a).c();
            }
            akrc b = ((itb) this.a).F.b("MessageListFragmentPeer onActionItemClicked");
            try {
                boolean B = ((itb) this.a).B(menuItem.getItemId());
                b.close();
                return B;
            } catch (Throwable th) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (menuItem.getItemId() != R.id.action_delete_message) {
            return false;
        }
        Object obj = this.a;
        zly zlyVar = (zly) obj;
        ajgi ajgiVar = new ajgi(zlyVar.c.fe());
        ajgiVar.y(zlyVar.c.z().getQuantityString(R.plurals.delete_message_confirmation_dialog_title, 1, 1));
        ajgiVar.m(R.string.delete_message_confirmation_dialog_text);
        ajgiVar.t(R.string.delete_message_confirmation_button, new ivs(obj, 18, null));
        ajgiVar.o(android.R.string.cancel, null);
        ajgiVar.s(new kmu(zlyVar, 2));
        ajgiVar.create().show();
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        Drawable icon;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                ((GalleryBrowserActivity) ((zmn) this.a).a).getMenuInflater().inflate(R.menu.full_screen_gallery_menu, menu);
                if (menu.size() != 0) {
                    MenuItem item = menu.getItem(0);
                    item.setActionView(R.layout.fullscreen_gallery_action_text_button);
                    View actionView = item.getActionView();
                    if (actionView != null) {
                        ((TextView) actionView.findViewById(R.id.container_action_button)).setText(item.getTitle());
                        actionView.setOnClickListener(new zoz(menu, item, 13, null));
                    }
                }
                return true;
            }
            ((ity) ((itb) this.a).K.b()).b(((itb) this.a).aO.b(), amgf.OPTIONS_MENU_OPENED);
            if (!((itb) this.a).aO.d() && ((itb) this.a).f.fe() != null) {
                itb itbVar = (itb) this.a;
                itbVar.aL = menu;
                cj F = itbVar.f.F();
                MenuInflater menuInflater = F.getMenuInflater();
                if ((F instanceof zgu) && ((zgu) F).G()) {
                    menuInflater.inflate(R.menu.conversation_fragment_select_menu_action_mode_v2, menu);
                } else {
                    menuInflater.inflate(R.menu.conversation_fragment_select_menu, menu);
                }
                menu.findItem(R.id.action_download).setVisible(itbVar.aO.f(6, F));
                menu.findItem(R.id.action_send).setVisible(itbVar.aO.f(5, F));
                menu.findItem(R.id.share_message_menu).setVisible(itbVar.aO.f(7, F));
                menu.findItem(R.id.save_attachment).setVisible(itbVar.aO.f(1, F));
                menu.findItem(R.id.forward_message_menu).setVisible(itbVar.aO.f(3, F));
                menu.findItem(R.id.details_menu).setVisible(itbVar.aO.f(4, F)).getIcon();
                menu.findItem(R.id.copy_text).setVisible(itbVar.aO.f(2, F));
                itbVar.q.ifPresent(new ile(16));
                ArrayList<MenuItem> g = itbVar.g(menu);
                Context x = itbVar.f.x();
                x.getClass();
                int f = ahnz.f(x, R.attr.colorPrimaryBrandNonIcon, "MessageListFragmentPeer");
                for (MenuItem menuItem : g) {
                    if (menuItem != null && (icon = menuItem.getIcon()) != null) {
                        icon.setTint(f);
                    }
                }
                itbVar.as.l(itbVar.g(menu));
                if (!((Boolean) abat.b.e()).booleanValue()) {
                    return true;
                }
                ((ksi) ((itb) this.a).A.b()).a();
                return true;
            }
            isz iszVar = ((itb) this.a).an;
            if (iszVar == null) {
                return false;
            }
            iszVar.l();
            return false;
        }
        zly zlyVar = (zly) this.a;
        if (zlyVar.m == -1) {
            return false;
        }
        zlyVar.c.fe().getMenuInflater().inflate(R.menu.sim_messages_fragment_select_menu, menu);
        View customView = actionMode.getCustomView();
        if (xwr.h(((zly) this.a).c.fe())) {
            alob alobVar = new alob();
            alobVar.h(menu.findItem(R.id.action_delete_message));
            alog g2 = alobVar.g();
            StringBuilder sb = new StringBuilder();
            int i2 = ((alsx) g2).c;
            for (int i3 = 0; i3 < i2; i3++) {
                MenuItem menuItem2 = (MenuItem) g2.get(i3);
                if (menuItem2.isVisible()) {
                    sb.append(menuItem2.getTitle());
                    sb.append(" ");
                }
            }
            xwr.i(customView, customView.getContext().getResources().getString(R.string.contextual_action_bar_description_prefix, sb.toString()));
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        int i = this.b;
        if (i == 0) {
            ((zly) this.a).b(-1);
            return;
        }
        if (i != 1) {
            AttachmentQueueState attachmentQueueState = ((aapj) ((zmn) this.a).a).C;
            if (attachmentQueueState.a.isEmpty()) {
                return;
            }
            attachmentQueueState.a = (List) Collection.EL.stream(attachmentQueueState.a).filter(new ytt(17)).collect(Collectors.toCollection(new zhh(11)));
            attachmentQueueState.g();
            return;
        }
        ((itb) this.a).i();
        ixd ixdVar = (ixd) ((itb) this.a).an;
        AppBarLayout appBarLayout = (AppBarLayout) ixdVar.q().findViewById(R.id.appBarLayout);
        if (appBarLayout != null && ixdVar.d) {
            appBarLayout.e = true;
            appBarLayout.n(false);
        }
        ((itb) this.a).an.l();
        ((itb) this.a).as.l(null);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }
}
