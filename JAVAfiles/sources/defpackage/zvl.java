package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zvl implements zsq {
    public static final xze a = xze.g("Bugle", "PremiumSmsBanner");
    public static final uuf b = uuh.n(uuh.b, "enable_premium_sms_banner", false);
    public static final utz c = uuh.h(uuh.b, "premium_sms_help_center_link", "https://support.google.com/messages/?p=premium_sms");
    public final Context d;
    public final enh e;
    public final zsl f;
    public final ConversationIdType g;
    public final armf h;
    public final abbu i;
    public final armf j;
    public final Intent l;
    public String m;
    public String n;
    public final ahiy p;
    private ztr q;
    private final zvq r;
    private final zlc s;
    private final aohs t;
    public boolean o = true;
    public final Intent k = new Intent("android.settings.PREMIUM_SMS_SETTINGS").setData(Uri.parse("package: com.android.settings"));

    public zvl(Context context, enh enhVar, zvq zvqVar, zlc zlcVar, aohs aohsVar, ahiy ahiyVar, armf armfVar, abbu abbuVar, armf armfVar2, zsl zslVar, ConversationIdType conversationIdType) {
        this.d = context;
        this.e = enhVar;
        this.r = zvqVar;
        this.t = aohsVar;
        this.s = zlcVar;
        this.p = ahiyVar;
        this.h = armfVar;
        this.i = abbuVar;
        this.j = armfVar2;
        this.f = zslVar;
        this.g = conversationIdType;
        this.l = new Intent("android.settings.APP_SEARCH_SETTINGS").putExtra(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY, context.getString(R.string.premium_sms_search_query));
    }

    @Override // defpackage.zsq
    public final zsm a() {
        boolean z = false;
        if (((Boolean) b.e()).booleanValue() && yhx.a) {
            z = true;
        }
        return new zsm("PremiumSmsBanner", z);
    }

    @Override // defpackage.zsq
    public final void g() {
        ConversationIdType conversationIdType = this.g;
        tay g = ush.g(conversationIdType);
        sxy d = MessagesTable.d();
        d.w("createMessagesTableQuery");
        d.t(MessagesTable.c.a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesTable.c.ac);
        arrayList.add(MessagesTable.c.k);
        arrayList.add(MessagesTable.c.j);
        d.c((sxp[]) arrayList.toArray(new sxp[arrayList.size()]));
        snf e = sni.e();
        e.h(new zvp(conversationIdType, 0));
        agog b2 = agoh.b(e.b(), sni.c.f, MessagesTable.c.a);
        b2.f = "latest_message";
        b2.b(true);
        d.A(b2.a());
        sxx b3 = d.b();
        zvq zvqVar = this.r;
        zvqVar.b = b3;
        this.t.C(new akfk(zvqVar.d, new izd(zvqVar, g, 14, null), "PREMIUM_SMS_BANNER_STATE_KEY".concat(conversationIdType.toString()), 2), new akgh<zvo>() { // from class: zvl.1
            @Override // defpackage.akgh
            public final void a(Throwable th) {
                zvl.a.q("Error getting get premium sms loaded data, conversationId: ".concat(zvl.this.g.toString()));
                zvl zvlVar = zvl.this;
                zvlVar.f.a(zvlVar, false);
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [msh, java.lang.Object] */
            @Override // defpackage.akgh
            public final /* synthetic */ void c(Object obj) {
                zvo zvoVar = (zvo) obj;
                Optional d2 = zvoVar.a.d();
                if (zvl.this.o && d2.isPresent() && msx.i(d2.get().j(((Boolean) new mss(2).get()).booleanValue()))) {
                    zvl zvlVar = zvl.this;
                    zvoVar.c.F(zvlVar.e, new zvm(zvlVar));
                }
                if (zvoVar.b) {
                    ParticipantsTable.BindData a2 = zvoVar.a.a();
                    if (a2 != null) {
                        zvl.this.m = a2.J();
                        zvl.this.n = a2.L();
                    }
                    ((zfh) zvl.this.j.b()).d();
                }
                zvl zvlVar2 = zvl.this;
                zvlVar2.f.a(zvlVar2, zvoVar.b);
                zvl.this.o = false;
            }

            @Override // defpackage.akgh
            public final /* synthetic */ void b() {
            }
        });
    }

    @Override // defpackage.zsq
    public final aabr h() {
        ztr a2 = this.s.a(this.d);
        this.q = a2;
        a2.e(this.d.getString(R.string.premium_sms_banner_description));
        this.q.p();
        this.q.h(R.drawable.quantum_gm_ic_info_black_24, ahnz.f(this.d, R.attr.colorPrimaryBrandIcon, "PremiumSmsBanner"));
        ztr ztrVar = this.q;
        if (this.m == null) {
            this.m = "";
        }
        String str = this.n;
        if (str == null) {
            ztrVar.d(this.d.getString(R.string.premium_sms_banner_body, this.m));
        } else {
            ztrVar.d(this.d.getString(R.string.premium_sms_banner_body_saved_contact, str, this.m));
        }
        boolean j = j(this.k);
        boolean j2 = j(this.l);
        if (!j) {
            ((zfh) this.j.b()).e(2);
        }
        if (!j2) {
            ((zfh) this.j.b()).e(3);
        }
        if (!j && !j2) {
            this.q.r();
        } else {
            this.q.l(this.d.getString(R.string.premium_sms_banner_open_settings_button));
            this.q.k(new ztv(this, 7));
        }
        this.q.g(this.d.getString(R.string.premium_sms_banner_learn_more_button));
        this.q.i(new ztv(this, 8));
        ztr ztrVar2 = this.q;
        ztrVar2.y = new ztw(this, 5);
        ztrVar2.j(new ztv(this, 9));
        return this.q;
    }

    public final void i() {
        ((zfh) this.j.b()).c();
        this.f.a(this, false);
    }

    public final boolean j(Intent intent) {
        if (intent.resolveActivity(this.d.getPackageManager()) != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.zsq
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.zsq
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.zsq
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.zsq
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.zsq
    public final void f() {
    }
}
