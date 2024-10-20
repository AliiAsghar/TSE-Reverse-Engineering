package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aapp extends aaqc {
    public static final aauj a;
    private static final amqj k;
    public boolean b;
    public final aajt c;
    public final aant d;
    private final da l;
    private final xnv m;
    private final Context n;
    private final aapk o;
    private final mcm p;
    private final Executor q;
    private akul r;
    private final zmr s;
    private final zkm t;
    private final abac u;

    static {
        aozy createBuilder = amqj.a.createBuilder();
        amqh amqhVar = amqh.CONTACT;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amqj amqjVar = (amqj) apagVar;
        amqjVar.c = amqhVar.v;
        amqjVar.b |= 1;
        amqi amqiVar = amqi.EXPANDED;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amqj amqjVar2 = (amqj) createBuilder.b;
        amqjVar2.d = amqiVar.e;
        amqjVar2.b |= 2;
        amqj amqjVar3 = (amqj) createBuilder.s();
        k = amqjVar3;
        a = new aauj(amqjVar3);
    }

    public aapp(xnv xnvVar, zkm zkmVar, aajt aajtVar, Context context, zmr zmrVar, mcm mcmVar, Executor executor, abac abacVar, aant aantVar, da daVar, aapk aapkVar, ContentGridView contentGridView, int i) {
        super(contentGridView, i);
        this.m = xnvVar;
        this.t = zkmVar;
        this.c = aajtVar;
        this.n = context;
        this.s = zmrVar;
        this.l = daVar;
        this.o = aapkVar;
        this.p = mcmVar;
        this.q = executor;
        this.d = aantVar;
        this.u = abacVar;
    }

    @Override // defpackage.aaqd
    public final int a() {
        return R.dimen.c2o_contact_item_height;
    }

    @Override // defpackage.aaqd
    public final int b() {
        return R.string.c2o_category_contact_content_description;
    }

    @Override // defpackage.aaqd
    protected final int c() {
        return R.drawable.quantum_gm_ic_person_white_24;
    }

    @Override // defpackage.aaqd
    public final Set d() {
        HashSet hashSet = new HashSet();
        hashSet.add(143);
        return hashSet;
    }

    @Override // defpackage.aaqc, defpackage.aaqd
    public final void e(View view) {
        super.e(view);
        View inflate = LayoutInflater.from(this.n).inflate(R.layout.compose2o_contact_view, (ViewGroup) this.e, false);
        View findViewById = inflate.findViewById(R.id.contact_view);
        findViewById.setOnClickListener(this.s.a(new aafl(this, 14)));
        findViewById.setAccessibilityDelegate(this.f);
        this.e.removeAllViews();
        this.e.addView(inflate);
    }

    @Override // defpackage.aaqd
    public final void f(Bundle bundle) {
        if (bundle != null && bundle.containsKey("share_contact_in_plain_text")) {
            this.b = bundle.getBoolean("share_contact_in_plain_text");
        }
    }

    @Override // defpackage.aaqd
    public final void g() {
        akul akulVar = this.r;
        if (akulVar != null) {
            akulVar.cancel(true);
            this.r = null;
        }
    }

    @Override // defpackage.aaqd
    public final void h(Bundle bundle) {
        bundle.putBoolean("share_contact_in_plain_text", this.b);
    }

    @Override // defpackage.aaqo
    public final void i() {
        if (((Boolean) aapt.a.e()).booleanValue()) {
            j(amqe.CATEGORY_HEADER);
        } else {
            k(amqe.CATEGORY_HEADER);
        }
    }

    public final void j(amqe amqeVar) {
        Resources resources = this.n.getResources();
        CharSequence[] charSequenceArr = {resources.getText(R.string.shareDialogTypeFile), resources.getText(R.string.shareDialogTypeText)};
        ise iseVar = new ise(this, amqeVar, 11);
        ajgi ajgiVar = new ajgi(this.n);
        ajgiVar.l(charSequenceArr, iseVar);
        ajgiVar.y(resources.getText(R.string.shareDialogTitle));
        ajgiVar.create().show();
    }

    public final void k(amqe amqeVar) {
        this.m.f().toEpochMilli();
        aapc aapcVar = (aapc) this.o;
        aapcVar.u.a(aapcVar.r);
        aapcVar.o(amqh.CONTACT, amqeVar);
    }

    @Override // defpackage.aaqd
    public final void l(aaas aaasVar) {
        Object obj;
        if (aaasVar.a == 143) {
            if (aaasVar.b == -1 && (obj = aaasVar.c) != null) {
                Uri data = ((Intent) obj).getData();
                if (data != null && this.l != null) {
                    ameb amebVar = ameb.CONTACT_CHOOSER;
                    if (this.b) {
                        this.r = this.t.c(data).h(new aald(this, 3), this.q);
                    } else {
                        this.u.c(data, new aapo(this, amebVar, 0));
                    }
                } else {
                    xzb.n("Bugle", "Not attaching vCard for selected contact because contact uri|fragmentManager is null.");
                }
            }
            mcm mcmVar = this.p;
            xnv xnvVar = this.m;
            amqj amqjVar = k;
            xnvVar.f().toEpochMilli();
            mcmVar.c(amqjVar, amqd.UNKNOWN_CLOSING_SOURCE);
        }
    }
}
