package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ztx implements zsq {
    public static final xze a = xze.g("Bugle", "AddContactBanner2o");
    public final cg b;
    public final Context c;
    public final mho d;
    public final qky e;
    public final armf f;
    public final msk g;
    public final zsl h;
    public final ConversationIdType i;
    public final armf j;
    public msh k;
    public ParticipantsTable.BindData l;
    public ProfilesTable.BindData m;
    public byte[] n = null;
    public boolean o = false;
    public final zug p;
    private final enh q;
    private final anen r;
    private final xwr s;
    private ztr t;
    private final zlc u;
    private final aohs v;

    public ztx(cg cgVar, Context context, enh enhVar, zug zugVar, mho mhoVar, qky qkyVar, zlc zlcVar, armf armfVar, aohs aohsVar, anen anenVar, msk mskVar, xwr xwrVar, armf armfVar2, zsl zslVar, ConversationIdType conversationIdType) {
        this.b = cgVar;
        this.c = context;
        this.q = enhVar;
        this.p = zugVar;
        this.d = mhoVar;
        this.e = qkyVar;
        this.u = zlcVar;
        this.f = armfVar;
        this.v = aohsVar;
        this.r = anenVar;
        this.g = mskVar;
        this.s = xwrVar;
        this.h = zslVar;
        this.i = conversationIdType;
        this.j = armfVar2;
    }

    @Deprecated
    private final String i() {
        String y;
        msh mshVar = this.k;
        if (mshVar != null) {
            if (((Boolean) this.j.b()).booleanValue()) {
                y = wfh.y(mshVar.G(true).toString());
            } else {
                y = wfh.y(mshVar.o(false));
            }
            if (y != null) {
                return y;
            }
            return "";
        }
        return "";
    }

    @Override // defpackage.zsq
    public final zsm a() {
        return new zsm("AddContactBanner", ((Boolean) zub.c.e()).booleanValue());
    }

    @Override // defpackage.zsq
    public final void b() {
        qiu.h(aktp.ah(new zom(this, 14), this.r));
    }

    @Override // defpackage.zsq
    public final void e() {
        ztr ztrVar = this.t;
        if (ztrVar == null) {
            return;
        }
        ztrVar.o();
    }

    @Override // defpackage.zsq
    public final void f() {
        ((igz) this.f.b()).c(new zhh(5));
    }

    @Override // defpackage.zsq
    public final void g() {
        zug zugVar = this.p;
        tay tayVar = zugVar.j;
        if (tayVar != null) {
            tayVar.G(zugVar.l);
        }
        ConversationIdType conversationIdType = this.i;
        if (((Boolean) zugVar.g.b()).booleanValue()) {
            zugVar.j = ush.i(conversationIdType);
        } else {
            zugVar.j = ush.g(conversationIdType);
        }
        enh enhVar = this.q;
        zugVar.l = new zue(zugVar, conversationIdType);
        zugVar.j.F(enhVar, zugVar.l);
        scm scmVar = zugVar.k;
        if (scmVar != null) {
            scmVar.G(zugVar.m);
        }
        scn a2 = scp.a();
        a2.w("createMessageAnnotationQuery");
        a2.c(new zvp(conversationIdType, 1));
        zugVar.k = a2.b();
        zugVar.m = new zuf(zugVar, conversationIdType);
        zugVar.k.F(enhVar, zugVar.m);
        this.v.C(new akfk(zugVar.q, new izd(zugVar, conversationIdType, 12, null), "ADD_CONTACT_BANNER_STATE_KEY".concat(conversationIdType.toString()), 2), new akgh<zud>() { // from class: ztx.1
            @Override // defpackage.akgh
            public final void a(Throwable th) {
                ztx.a.q("Error getting get add contact loaded data, conversationId: ".concat(ztx.this.i.toString()));
                ztx ztxVar = ztx.this;
                ztxVar.h.a(ztxVar, false);
            }

            @Override // defpackage.akgh
            public final /* synthetic */ void c(Object obj) {
                zud zudVar = (zud) obj;
                if (zudVar.b) {
                    ztx.this.l = zudVar.a.a();
                    ztx ztxVar = ztx.this;
                    ParticipantsTable.BindData bindData = ztxVar.l;
                    bindData.getClass();
                    ztxVar.k = ztxVar.g.q(bindData);
                    ztx ztxVar2 = ztx.this;
                    boolean z = zudVar.c;
                    boolean z2 = false;
                    if (lbp.c() && !z) {
                        z2 = true;
                    }
                    ztxVar2.o = z2;
                    if (((Boolean) ztx.this.j.b()).booleanValue()) {
                        ztx ztxVar3 = ztx.this;
                        ParticipantsTable.BindData a3 = zudVar.a.a();
                        ProfilesTable.BindData bindData2 = null;
                        if (a3 != null && a3.as("profiles_table_join_tag")) {
                            bindData2 = (ProfilesTable.BindData) a3.al("profiles_table_join_tag", ProfilesTable.BindData.class);
                        }
                        ztxVar3.m = bindData2;
                        ztx.this.n = zudVar.d;
                    }
                }
                ztx ztxVar4 = ztx.this;
                ztxVar4.h.a(ztxVar4, zudVar.b);
            }

            @Override // defpackage.akgh
            public final void b() {
            }
        });
    }

    @Override // defpackage.zsq
    public final aabr h() {
        String string;
        ProfilesTable.BindData bindData;
        String string2;
        String string3;
        ProfilesTable.BindData bindData2;
        Object obj;
        ProfilesTable.BindData bindData3;
        Object obj2;
        ztr a2 = this.u.a(this.c);
        this.t = a2;
        a2.e(this.c.getString(R.string.add_contact_banner_description));
        this.t.p();
        this.t.h(R.drawable.quantum_gm_ic_person_add_black_24, ahnz.f(this.c, R.attr.colorPrimaryBrandIcon, "AddContactBanner"));
        ztr ztrVar = this.t;
        int i = 1;
        int i2 = 2;
        Object obj3 = "";
        int i3 = 0;
        if (((Boolean) new msu(1).get()).booleanValue()) {
            if (((Boolean) this.j.b()).booleanValue() && (bindData3 = this.m) != null && !TextUtils.isEmpty(bindData3.l())) {
                Context context = this.c;
                msh mshVar = this.k;
                if (mshVar == null) {
                    obj2 = "";
                } else {
                    obj2 = this.s.a(mshVar);
                }
                ProfilesTable.BindData bindData4 = this.m;
                bindData4.getClass();
                string = context.getString(R.string.add_contact_banner_title_with_name, obj2, bindData4.l());
            } else {
                Context context2 = this.c;
                msh mshVar2 = this.k;
                if (mshVar2 == null) {
                    obj = "";
                } else {
                    obj = this.s.a(mshVar2);
                }
                string = context2.getString(R.string.add_contact_banner_title_v2, obj);
            }
        } else if (((Boolean) this.j.b()).booleanValue() && (bindData = this.m) != null && !TextUtils.isEmpty(bindData.l())) {
            Context context3 = this.c;
            String i4 = i();
            ProfilesTable.BindData bindData5 = this.m;
            bindData5.getClass();
            string = context3.getString(R.string.add_contact_banner_title_with_name, i4, bindData5.l());
        } else {
            string = this.c.getString(R.string.add_contact_banner_title_v2, i());
        }
        ztrVar.m(string);
        ztr ztrVar2 = this.t;
        if (((Boolean) this.j.b()).booleanValue() && (bindData2 = this.m) != null && !TextUtils.isEmpty(bindData2.l())) {
            string2 = this.c.getString(R.string.add_contact_banner_body_profile_disclosure);
        } else {
            string2 = this.c.getString(R.string.add_contact_banner_body_v2);
        }
        ztrVar2.d(string2);
        this.t.l(this.c.getString(R.string.add_contact_banner_spam_button));
        this.t.g(this.c.getString(R.string.add_contact_banner_add_button));
        this.t.i(new ztv(this, i));
        ztr ztrVar3 = this.t;
        ztrVar3.y = new ztw(this, 0);
        ztrVar3.j(new ztv(this, i3));
        this.t.k(new ztv(this, i2));
        ztr ztrVar4 = this.t;
        ztrVar4.C = new ztv(this, 3);
        ztrVar4.z = null;
        if (this.o) {
            if (((Boolean) new msu(1).get()).booleanValue()) {
                Context context4 = this.c;
                msh mshVar3 = this.k;
                if (mshVar3 != null) {
                    obj3 = this.s.a(mshVar3);
                }
                string3 = context4.getString(R.string.report_spam_banner_title, obj3);
            } else {
                string3 = this.c.getString(R.string.report_spam_banner_title, i());
            }
            ztrVar4.m(string3);
            this.t.d(this.c.getString(R.string.report_spam_banner_body));
            this.t.l(this.c.getString(R.string.report_spam_banner_spam_button));
            this.t.g(this.c.getString(R.string.report_spam_banner_dismiss_button));
        }
        return this.t;
    }

    @Override // defpackage.zsq
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.zsq
    public final /* synthetic */ void d() {
    }
}
