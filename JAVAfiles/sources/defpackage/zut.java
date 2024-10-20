package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zut implements zsq {
    public static final xze a = xze.g("Bugle", "AddAreaCodeBanner");
    public final Context b;
    public final armf c;
    public final zsl d;
    public final ConversationIdType e;
    public ResolvedRecipient f;
    private final enh g;
    private final akbo h;
    private final zsx i;
    private ztr j;
    private final zuu k = new zuu(this);
    private final zkm l;
    private final zlc m;
    private final aohs n;

    public zut(Context context, enh enhVar, aohs aohsVar, akbo akboVar, armf armfVar, zlc zlcVar, zkm zkmVar, zsl zslVar, ConversationIdType conversationIdType, zsx zsxVar) {
        this.b = context;
        this.g = enhVar;
        this.n = aohsVar;
        this.h = akboVar;
        this.c = armfVar;
        this.m = zlcVar;
        this.l = zkmVar;
        this.d = zslVar;
        this.e = conversationIdType;
        this.i = zsxVar;
    }

    @Override // defpackage.zsq
    public final zsm a() {
        Object e = ((utz) zuw.a.get()).e();
        e.getClass();
        return new zsm("AddAreaCodeBanner", ((Boolean) e).booleanValue());
    }

    @Override // defpackage.zsq
    public final void b() {
        i();
    }

    @Override // defpackage.zsq
    public final void e() {
        ztr ztrVar;
        if (this.i != zsx.CONVERSATION_DETAILS && (ztrVar = this.j) != null) {
            ztrVar.o();
        }
    }

    @Override // defpackage.zsq
    public final void f() {
        this.h.b(this.k);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.zsq
    public final void g() {
        ConversationIdType conversationIdType = this.e;
        if (!conversationIdType.b()) {
            enh enhVar = this.g;
            zkm zkmVar = this.l;
            ncq d = ((ndi) zkmVar.b).d(new BugleConversationId(conversationIdType));
            Objects.toString(conversationIdType);
            this.n.C(new akfk(((uac) zkmVar.a).e(d, "ADD_AREA_CODE_BANNER_STATE_KEY:".concat(conversationIdType.toString()), enhVar), new zms(4), (Executor) zkmVar.c, 1), new akgh<zuy>() { // from class: zut.1
                @Override // defpackage.akgh
                public final void a(Throwable th) {
                    zut zutVar = zut.this;
                    zutVar.d.a(zutVar, false);
                    ConversationIdType conversationIdType2 = zut.this.e;
                    Objects.toString(conversationIdType2);
                    throw new IllegalStateException("Error getting add area code loaded data for conversationId ".concat(conversationIdType2.toString()), th);
                }

                @Override // defpackage.akgh
                public final /* bridge */ /* synthetic */ void c(Object obj) {
                    zuy zuyVar = (zuy) obj;
                    zuyVar.getClass();
                    zut zutVar = zut.this;
                    zutVar.f = zuyVar.b;
                    boolean z = false;
                    if (zuyVar.a && zutVar.f != null) {
                        z = true;
                    }
                    zutVar.d.a(zutVar, z);
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
        msh mshVar;
        ztr a2 = this.m.a(this.b);
        this.j = a2;
        a2.e(this.b.getString(R.string.area_code_banner_description));
        a2.p();
        a2.h(R.drawable.quantum_ic_info_outline_black_24, this.b.getColor(R.color.conversation_action_icon_color_m2));
        String string = this.b.getString(R.string.add_area_code_banner_button);
        string.getClass();
        Resources resources = this.b.getResources();
        ResolvedRecipient resolvedRecipient = this.f;
        if (resolvedRecipient != null) {
            mshVar = resolvedRecipient.f();
        } else {
            mshVar = null;
        }
        mshVar.getClass();
        String string2 = resources.getString(R.string.conversation_area_code_popup_paragraph, mshVar.F(), string);
        string2.getClass();
        a2.d(aabr.ae(this.b, string2, string, new zqq(this, 10)));
        a2.i(new ztv(this, 4));
        a2.y = new ztw(this, 2);
        return this.j;
    }

    public final void i() {
        ResolvedRecipient resolvedRecipient = this.f;
        if (resolvedRecipient != null) {
            akbo akboVar = this.h;
            zkm zkmVar = this.l;
            akboVar.j(new ahlp(((ndi) zkmVar.b).m(resolvedRecipient.z(), mta.MODIFIED_AND_INFORMED)), new ahlp((Object) null), this.k);
        }
    }

    @Override // defpackage.zsq
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.zsq
    public final /* synthetic */ void d() {
    }
}
