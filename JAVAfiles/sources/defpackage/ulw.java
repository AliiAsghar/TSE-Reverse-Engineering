package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ulw extends unp {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/workhandlers/DeleteConversationHandler");
    static final utz b;
    static final utz c;
    public final uli A;
    public final vjs B;
    public final lpg C;
    private final anen E;
    private final armf F;
    private final armf G;
    public final xze d = xze.g("BugleDataModel", "DeleteConversationHandler");
    public final armf e;
    public final Context f;
    public final anen g;
    public final agnq h;
    public final qik i;
    public final armf j;
    public final armf k;
    public final armf l;
    public final armf m;
    public final armf n;
    public final lzy o;
    public final Optional p;
    public final armf q;
    public final mgv r;
    public final uhj s;
    public final rys t;
    public final xoa u;
    public final armf v;
    public final armf w;
    public final armf x;
    public final apwt y;
    public final uli z;

    static {
        uuh.x(216833586, "cancel_file_transfer_messages_first");
        b = uuh.e(uuh.b, "max_message_deletes_per_proto", 100);
        c = uuh.e(uuh.b, "max_parts_cleanup_per_proto", 100);
    }

    public ulw(Context context, anen anenVar, anen anenVar2, agnq agnqVar, lpg lpgVar, uli uliVar, uli uliVar2, vjs vjsVar, qik qikVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, lzy lzyVar, Optional optional, armf armfVar6, mgv mgvVar, uhj uhjVar, rys rysVar, xoa xoaVar, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, apwt apwtVar) {
        this.f = context;
        this.E = anenVar;
        this.g = anenVar2;
        this.h = agnqVar;
        this.C = lpgVar;
        this.A = uliVar;
        this.z = uliVar2;
        this.B = vjsVar;
        this.i = qikVar;
        this.j = armfVar;
        this.k = armfVar2;
        this.l = armfVar3;
        this.m = armfVar4;
        this.n = armfVar5;
        this.o = lzyVar;
        this.p = optional;
        this.q = armfVar6;
        this.r = mgvVar;
        this.s = uhjVar;
        this.t = rysVar;
        this.u = xoaVar;
        this.e = armfVar7;
        this.v = armfVar8;
        this.w = armfVar9;
        this.F = armfVar10;
        this.G = armfVar11;
        this.x = armfVar12;
        this.y = apwtVar;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.c = amdy.DELETE_CONVERSATION_ACTION;
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("DeleteConversationHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        ulx ulxVar = (ulx) apbtVar;
        ConversationIdType b2 = ruy.b(ulxVar.b);
        if (b2.b()) {
            this.d.m("conversationId is empty.");
            return aktp.ag(upm.d());
        }
        if (ulxVar.e == amfe.CONVERSATION_FROM_COMPOSE.t && ulxVar.d) {
            try {
                xxw s = ((rtz) this.l.b()).s(b2);
                if (s == null) {
                    xyo e = this.d.e();
                    e.H("Skip deleting conversation since it appears it's not in database.");
                    e.z("conversationId", ulxVar.b);
                    e.q();
                } else if (s.equals(xxw.CMS_RESTORE_IN_PROGRESS) || s.equals(xxw.RESTORED_FROM_CMS) || s.equals(xxw.MERGED_FROM_CMS)) {
                    if (qop.f(((qif) this.G.b()).a())) {
                        xyo c2 = this.d.c();
                        c2.H("Skip deleting conversation during initial restore for background task.");
                        c2.z("conversationId", ulxVar.b);
                        c2.q();
                    }
                }
                return aktp.ag(upm.b());
            } catch (apba e2) {
                xyo e3 = this.d.e();
                e3.z("conversationId", ulxVar.b);
                e3.H("Unable to parse CmsSettingsData, will delete conversation.");
                e3.r(e2);
            }
        }
        return aktp.aj(new ncx(this, ulxVar, b2, 8, (byte[]) null), this.E).i(new twe(this, b2, 6, null), this.E).i(new ukk(this, ulxVar, b2, 2), this.E);
    }

    @Override // defpackage.unx
    public final apca e() {
        return ulx.a.getParserForType();
    }

    public final void j(aozy aozyVar, int i, Uri uri) {
        if (ameb.b(i) != ameb.GIF_CHOOSER) {
            String uri2 = uri.toString();
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            uls ulsVar = (uls) aozyVar.b;
            uls ulsVar2 = uls.a;
            uri2.getClass();
            apax apaxVar = ulsVar.b;
            if (!apaxVar.c()) {
                ulsVar.b = apag.mutableCopy(apaxVar);
            }
            ulsVar.b.add(uri2);
            if (((uls) aozyVar.b).b.size() >= ((Integer) c.e()).intValue()) {
                this.A.c((uls) aozyVar.s());
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                ((uls) aozyVar.b).b = apag.emptyProtobufList();
            }
        }
    }
}
