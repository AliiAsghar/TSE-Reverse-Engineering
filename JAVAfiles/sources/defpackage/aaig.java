package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.Collection;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaig implements ActionMode.Callback {
    public static final /* synthetic */ int d = 0;
    private static final alog e = alog.w(Integer.valueOf(R.id.action_archive), Integer.valueOf(R.id.action_unarchive), Integer.valueOf(R.id.action_add_contact), Integer.valueOf(R.id.action_block), Integer.valueOf(R.id.action_report_spam), Integer.valueOf(R.id.action_delete));
    public final tm a = new tm();
    public HashSet b;
    int c;
    private final Context f;
    private final ytk g;
    private final xbf h;
    private final xxe i;
    private final Optional j;
    private final armf k;
    private final armf l;
    private boolean m;
    private Menu n;
    private MenuItem o;
    private MenuItem p;
    private MenuItem q;
    private MenuItem r;
    private MenuItem s;
    private Toast t;
    private final kvw u;

    public aaig(Context context, ytk ytkVar, xbf xbfVar, xxe xxeVar, Optional optional, kvw kvwVar, armf armfVar, armf armfVar2) {
        this.f = context;
        this.g = ytkVar;
        this.h = xbfVar;
        this.i = xxeVar;
        this.j = optional;
        this.u = kvwVar;
        this.k = armfVar;
        this.l = armfVar2;
    }

    private final void f() {
        boolean z;
        Toast makeText;
        Toast toast;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        boolean z6;
        boolean z7;
        if (this.m) {
            tm tmVar = this.a;
            if (tmVar.d == 1) {
                SelectedConversation selectedConversation = (SelectedConversation) tmVar.g(0);
                MenuItem menuItem = this.q;
                int i = selectedConversation.g;
                boolean isEmpty = TextUtils.isEmpty(selectedConversation.m);
                boolean z8 = selectedConversation.h;
                msh t = ((msk) this.l.b()).t(selectedConversation.k, selectedConversation.p);
                if (((Boolean) ((utz) yig.Q.get()).e()).booleanValue() && t.z()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (selectedConversation.n && this.g.d()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!selectedConversation.f.g() && !selectedConversation.f.e()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                boolean g = g(selectedConversation.o);
                if (i == 0 && isEmpty && !z8 && !z2 && !z3 && !z4 && !g) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                menuItem.setVisible(z5);
                MenuItem menuItem2 = this.r;
                if (!this.i.b() || (!g(selectedConversation.o) ? !((str = selectedConversation.k) != null && !this.b.contains(str) && !this.h.e(selectedConversation.k)) : !(!selectedConversation.f.g() && !selectedConversation.f.e()))) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                menuItem2.setVisible(z6);
                MenuItem menuItem3 = this.s;
                if (selectedConversation.g == 0 || selectedConversation.f.g()) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                menuItem3.setVisible(z7);
                this.q.setShowAsAction(1);
                MenuItem menuItem4 = this.r;
                int i2 = 2;
                if (!g(selectedConversation.o) && TextUtils.isEmpty(selectedConversation.m)) {
                    i2 = 1;
                }
                menuItem4.setShowAsAction(i2);
            } else {
                this.q.setVisible(false);
                this.r.setVisible(false);
                this.s.setVisible(false);
            }
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            for (SelectedConversation selectedConversation2 : this.a.values()) {
                boolean z15 = selectedConversation2.i;
                z9 |= !z15;
                z10 |= z15;
                if (selectedConversation2.f.d()) {
                    if (selectedConversation2.f.h()) {
                        z12 = true;
                        z13 = true;
                    } else {
                        z12 = true;
                    }
                } else {
                    z14 = true;
                }
                z11 |= g(selectedConversation2.o);
                if (z9 && z10 && z12 && z13 && z14 && z11) {
                    break;
                }
            }
            MenuItem menuItem5 = this.o;
            if (uyh.a() && z11) {
                z14 = false;
            }
            menuItem5.setVisible(z14);
            MenuItem menuItem6 = this.p;
            if (z12 && !z13) {
                z = true;
            } else {
                z = false;
            }
            menuItem6.setVisible(z);
            this.j.ifPresent(new aagi(this, 5));
            if (xwr.h(this.f)) {
                Context context = this.f;
                alog b = b(this.n);
                StringBuilder sb = new StringBuilder();
                int i3 = ((alsx) b).c;
                for (int i4 = 0; i4 < i3; i4++) {
                    MenuItem menuItem7 = (MenuItem) b.get(i4);
                    if (menuItem7.isVisible()) {
                        sb.append(menuItem7.getTitle());
                        sb.append(" ");
                    }
                }
                String string = context.getResources().getString(R.string.contextual_action_bar_description_prefix, sb.toString());
                if (!xwr.g(context)) {
                    makeText = null;
                } else {
                    makeText = Toast.makeText(context, string, 0);
                    makeText.show();
                }
                if (makeText != null && (toast = this.t) != null) {
                    toast.cancel();
                }
                this.t = makeText;
            }
        }
    }

    private static boolean g(int i) {
        if (uyh.a() && i == 4) {
            return true;
        }
        return false;
    }

    public final int a() {
        return this.a.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final alog b(Menu menu) {
        alob alobVar = new alob();
        alog alogVar = e;
        int i = ((alsx) alogVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            MenuItem findItem = menu.findItem(((Integer) alogVar.get(i2)).intValue());
            if (findItem != null) {
                alobVar.h(findItem);
            }
        }
        this.j.ifPresent(new zcd(menu, alobVar, 7));
        return alobVar.g();
    }

    public final void c(boolean z, View view) {
        String string;
        Resources resources = this.f.getResources();
        if (z) {
            string = resources.getString(R.string.action_selected);
        } else {
            string = resources.getString(R.string.action_unselected);
        }
        xwr.i(view, string);
    }

    public final void d() {
        if (this.a.isEmpty()) {
            this.u.o();
        } else {
            f();
        }
    }

    public final boolean e(ConversationIdType conversationIdType) {
        return this.a.containsKey(conversationIdType);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        lan b;
        boolean z;
        boolean z2;
        akul ai;
        boolean z3;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_delete) {
            kvw kvwVar = this.u;
            tm tmVar = this.a;
            kux kuxVar = kvwVar.b;
            Collection values = tmVar.values();
            if (!yhx.h(kuxVar.y())) {
                ((abbu) kvwVar.G.b()).h(R.string.sms_disallowed_message);
            } else if (!kvwVar.j.y()) {
                kuy.a.q("Can't delete messages when it's not default sms app");
            } else if (((pgo) kvwVar.bl.b()).a() && kvwVar.b.Q == null) {
                kuy.a.q("Can't show the dialog since the fragment doesn't have a view");
            } else {
                ((lfl) kvwVar.F.b()).b(kvwVar.g(kvwVar.b), values, amfe.CONVERSATION_FROM_LIST, new kut(kvwVar, 4));
            }
            return true;
        }
        if (itemId == R.id.action_archive) {
            this.u.p(this.a.values(), true);
            return true;
        }
        if (itemId == R.id.action_unarchive) {
            this.u.p(this.a.values(), false);
            return true;
        }
        msh mshVar = null;
        if (itemId == R.id.action_add_contact) {
            int i = this.a.d;
            if (i == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            albo.U(z3, String.format("Attempted to execute add contact action when the number of selected messages is %d.", Integer.valueOf(i)));
            kvw kvwVar2 = this.u;
            SelectedConversation selectedConversation = (SelectedConversation) this.a.g(0);
            String str = selectedConversation.j;
            if (str != null) {
                Uri.parse(str);
            }
            String str2 = selectedConversation.k;
            qky qkyVar = (qky) kvwVar2.D.b();
            View L = kvwVar2.b.L();
            if (str2 != null) {
                mshVar = ((msk) kvwVar2.X.b()).t(str2, selectedConversation.p);
            }
            qkyVar.h(L, -1L, null, -1L, mshVar, 3);
            kvwVar2.o();
            return true;
        }
        if (itemId == R.id.action_block) {
            int i2 = this.a.d;
            if (i2 == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            albo.U(z2, String.format("Attempted to execute block action when the number of selected messages is %d.", Integer.valueOf(i2)));
            kvw kvwVar3 = this.u;
            SelectedConversation selectedConversation2 = (SelectedConversation) this.a.g(0);
            String str3 = selectedConversation2.k;
            if (str3 == null) {
                ai = aktp.ag(null);
            } else {
                kwq kwqVar = kvwVar3.z;
                ai = aktp.ai(new haw(kwqVar, str3, 13), ((kws) kwqVar).a);
            }
            kvwVar3.y.j(new ahlp(ai), new ahlp(selectedConversation2), kvwVar3.ap);
            return true;
        }
        if (itemId == R.id.action_report_spam) {
            int i3 = this.a.d;
            if (i3 == 1) {
                z = true;
            } else {
                z = false;
            }
            albo.U(z, String.format("Attempted to execute report spam action when the number of selected messages is %d.", Integer.valueOf(i3)));
            kvw kvwVar4 = this.u;
            SelectedConversation selectedConversation3 = (SelectedConversation) this.a.g(0);
            ConversationIdType conversationIdType = selectedConversation3.a;
            kwq kwqVar2 = kvwVar4.z;
            kvwVar4.y.j(new ahlp(aktp.ai(new haw(kwqVar2, conversationIdType, 14), ((kws) kwqVar2).a)), new ahlp(selectedConversation3), kvwVar4.aq);
            return true;
        }
        if (itemId == 16908332) {
            this.u.o();
            return true;
        }
        if (!this.j.isPresent() || (b = ((lao) this.j.get()).b()) == null) {
            return false;
        }
        this.a.values();
        b.c();
        this.u.o();
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        Context context = this.f;
        if ((context instanceof zgu) && ((zgu) context).G()) {
            actionMode.getMenuInflater().inflate(R.menu.conversation_list_fragment_select_menu_action_mode_v2, menu);
        } else {
            actionMode.getMenuInflater().inflate(R.menu.conversation_list_fragment_select_menu, menu);
        }
        this.n = menu;
        this.o = menu.findItem(R.id.action_archive);
        this.p = menu.findItem(R.id.action_unarchive);
        this.q = menu.findItem(R.id.action_add_contact);
        this.r = menu.findItem(R.id.action_block);
        this.s = menu.findItem(R.id.action_report_spam);
        this.j.ifPresent(new aabj(14));
        alog b = b(menu);
        this.c = ahnz.f(this.f, R.attr.colorPrimaryBrandIcon, "MultiSelectActionModeCallback");
        alur it = b.iterator();
        while (it.hasNext()) {
            MenuItem menuItem = (MenuItem) it.next();
            if (((ohq) this.k.b()).a()) {
                menuItem.setIconTintList(ColorStateList.valueOf(this.c));
            } else {
                Drawable icon = menuItem.getIcon();
                if (icon != null) {
                    icon.setTint(this.c);
                }
            }
        }
        actionMode.getCustomView();
        this.m = true;
        f();
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.a.clear();
        this.m = false;
        this.u.o();
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }
}
