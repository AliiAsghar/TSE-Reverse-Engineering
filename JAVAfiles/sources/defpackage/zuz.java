package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zuz implements zsq {
    public static final xze a = xze.g("Bugle", "AddCountryCodeBanner");
    public final Context b;
    public final armf c;
    public final zsl d;
    public final ConversationIdType e;
    public ResolvedRecipient f;
    private final enh g;
    private final akbo h;
    private final yjr i;
    private final zsx j;
    private ztr k;
    private final zva l = new zva(this);
    private final zme m;
    private final zlc n;
    private final aohs o;

    public zuz(Context context, enh enhVar, aohs aohsVar, akbo akboVar, armf armfVar, zlc zlcVar, zme zmeVar, yjr yjrVar, zsl zslVar, ConversationIdType conversationIdType, zsx zsxVar) {
        this.b = context;
        this.g = enhVar;
        this.o = aohsVar;
        this.h = akboVar;
        this.c = armfVar;
        this.n = zlcVar;
        this.m = zmeVar;
        this.i = yjrVar;
        this.d = zslVar;
        this.e = conversationIdType;
        this.j = zsxVar;
    }

    @Override // defpackage.zsq
    public final zsm a() {
        Object e = ((utz) zvd.a.get()).e();
        e.getClass();
        return new zsm("AddCountryCodeBanner", ((Boolean) e).booleanValue());
    }

    @Override // defpackage.zsq
    public final void b() {
        i();
    }

    @Override // defpackage.zsq
    public final void e() {
        ztr ztrVar;
        if (this.j != zsx.CONVERSATION_DETAILS && (ztrVar = this.k) != null) {
            ztrVar.o();
        }
    }

    @Override // defpackage.zsq
    public final void f() {
        this.h.b(this.l);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.zsq
    public final void g() {
        ConversationIdType conversationIdType = this.e;
        if (!conversationIdType.b()) {
            enh enhVar = this.g;
            zme zmeVar = this.m;
            ncq d = ((ndi) zmeVar.b).d(new BugleConversationId(conversationIdType));
            Objects.toString(conversationIdType);
            this.o.C(new akfk(((uac) zmeVar.a).e(d, "ADD_COUNTRY_CODE_BANNER_STATE_KEY:".concat(conversationIdType.toString()), enhVar), new zms(5), (Executor) zmeVar.c, 1), new akgh<atkn>() { // from class: zuz.1
                @Override // defpackage.akgh
                public final void a(Throwable th) {
                    zuz zuzVar = zuz.this;
                    zuzVar.d.a(zuzVar, false);
                    ConversationIdType conversationIdType2 = zuz.this.e;
                    Objects.toString(conversationIdType2);
                    throw new IllegalStateException("Error getting add country code loaded data for conversationId ".concat(conversationIdType2.toString()), th);
                }

                /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
                @Override // defpackage.akgh
                public final /* bridge */ /* synthetic */ void c(Object obj) {
                    atkn atknVar = (atkn) obj;
                    atknVar.getClass();
                    zuz zuzVar = zuz.this;
                    zuzVar.f = atknVar.b;
                    boolean z = false;
                    if (atknVar.a && zuzVar.f != null) {
                        z = true;
                    }
                    zuzVar.d.a(zuzVar, z);
                }

                @Override // defpackage.akgh
                public final /* synthetic */ void b() {
                }
            });
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.zsq
    public final aabr h() {
        yjt yjtVar;
        String str;
        msh f;
        Optional b;
        ztr a2 = this.n.a(this.b);
        this.k = a2;
        a2.p();
        a2.h(R.drawable.quantum_ic_info_outline_black_24, this.b.getColor(R.color.conversation_action_icon_color_m2));
        String string = this.b.getString(R.string.add_country_code_banner_button);
        string.getClass();
        ResolvedRecipient resolvedRecipient = this.f;
        if (resolvedRecipient == null || (f = resolvedRecipient.f()) == null || (b = f.b()) == null || (yjtVar = (yjt) b.orElse(new yjt(0))) == null) {
            yjtVar = new yjt(0);
        }
        Resources resources = this.b.getResources();
        if (!yjtVar.a()) {
            str = this.i.s(yjtVar);
        } else {
            str = "";
        }
        String string2 = resources.getString(R.string.conversation_country_code_popup_paragraph, yjtVar, str, string);
        string2.getClass();
        a2.d(aabr.ae(this.b, string2, string, new zqq(this, 11)));
        a2.i(new ztv(this, 5));
        a2.y = new ztw(this, 3);
        return this.k;
    }

    public final void i() {
        ResolvedRecipient resolvedRecipient = this.f;
        if (resolvedRecipient != null) {
            akbo akboVar = this.h;
            zme zmeVar = this.m;
            akboVar.j(new ahlp(((ndi) zmeVar.b).m(resolvedRecipient.z(), mta.MODIFIED_AND_INFORMED)), new ahlp((Object) null), this.l);
        }
    }

    @Override // defpackage.zsq
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.zsq
    public final /* synthetic */ void d() {
    }
}
