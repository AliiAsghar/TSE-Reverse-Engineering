package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ndi implements yfx {
    public final Context a;
    public final anen b;
    public final msk c;
    public final armf d;
    public final armf e;
    public final Optional f;
    public final tde g;
    public final yyt h;
    private final nds i;
    private final armf j;
    private final armf k;
    private final armf l;
    private final grn m;

    public ndi(Context context, anen anenVar, grn grnVar, wfh wfhVar, msk mskVar, tde tdeVar, nds ndsVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, Optional optional) {
        this.a = context;
        this.b = anenVar;
        this.m = grnVar;
        this.h = wfhVar.Y(this);
        this.c = mskVar;
        this.g = tdeVar;
        this.k = armfVar;
        this.i = ndsVar;
        this.j = armfVar2;
        this.e = armfVar3;
        this.l = armfVar4;
        this.d = armfVar5;
        this.f = optional;
    }

    public static tay g(ConversationId conversationId) {
        BugleConversationId bugleConversationId = new BugleConversationId(conversationId.b());
        taz e = ParticipantsTable.e();
        e.w("getActiveRecipientParticipantsQuery");
        if (oez.a() && !oey.a()) {
            tdj a = ProfilesTable.a();
            a.d(new ncy(9));
            agog b = agoh.b(a.b(), (agmh) ProfilesTable.c.b, ParticipantsTable.c.a);
            b.f = "profiles_table_join_tag";
            e.D(b.a());
        }
        if (oez.a() && oey.a()) {
            agog b2 = agoh.b(ProfilesTable.a().b(), (agmh) ProfilesTable.c.b, ParticipantsTable.c.a);
            b2.f = "profiles_table_join_tag";
            e.D(b2.a());
        }
        sjk a2 = sjm.a();
        a2.c(new ncy(10));
        agog b3 = agoh.b(a2.b(), (agmh) sjm.e.o, ParticipantsTable.c.q);
        b3.f = "contacts_table_join_tag";
        e.D(b3.a());
        e.g(new ndf(bugleConversationId, 8));
        return e.b();
    }

    public static tay h(alog alogVar) {
        if (oez.a() && oey.a()) {
            taz e = ParticipantsTable.e();
            e.w("getAllRecipientParticipantsByIdQuery");
            e.g(new ndf(alogVar, 3));
            agog b = agoh.b(ProfilesTable.a().b(), (agmh) ProfilesTable.c.b, ParticipantsTable.c.a);
            b.f = "profiles_table_join_tag";
            e.D(b.a());
            return e.b();
        }
        taz e2 = ParticipantsTable.e();
        e2.w("getAllRecipientParticipantsByIdQuery");
        e2.g(new ndf(alogVar, 4));
        return e2.b();
    }

    public final ncq c(ConversationId conversationId) {
        return ((ndm) this.l.b()).a(new nde(conversationId, 2), new ndh(this, conversationId, 2));
    }

    public final ncq d(ConversationId conversationId) {
        return ((ndm) this.l.b()).a(new nde(conversationId, 0), new ndh(this, conversationId, 0));
    }

    public final Recipient e(msh mshVar) {
        return this.g.a(this.i.a(mshVar), mshVar);
    }

    public final ResolvedRecipient f(ParticipantsTable.BindData bindData) {
        return this.g.a(bindData, this.c.q(bindData));
    }

    @Override // defpackage.yfx
    public final void fs() {
        boolean z;
        Uri p = upb.p(this.a);
        qdq qdqVar = new qdq(this);
        grn grnVar = this.m;
        synchronized (grnVar.c) {
            synchronized (grnVar.c) {
                if (grnVar.e != null) {
                    z = true;
                } else {
                    z = false;
                }
            }
            d.t(!z, "Already registered");
            ContentResolver contentResolver = ((Context) grnVar.b).getContentResolver();
            grnVar.e = new ngn(grnVar, qdqVar);
            contentResolver.registerContentObserver(p, true, (ContentObserver) grnVar.e);
        }
    }

    @Override // defpackage.yfx
    public final void ft() {
        grn grnVar = this.m;
        synchronized (grnVar.c) {
            ContentResolver contentResolver = ((Context) grnVar.b).getContentResolver();
            Object obj = grnVar.e;
            if (obj != null) {
                contentResolver.unregisterContentObserver((ContentObserver) obj);
                grnVar.e = null;
            }
        }
    }

    public final tay i(ConversationId conversationId) {
        tay b;
        BugleConversationId bugleConversationId = new BugleConversationId(conversationId.b());
        taz e = ParticipantsTable.e();
        e.w("getAllRecipientParticipantsForConversationQuery");
        if (((Boolean) this.k.b()).booleanValue()) {
            agog b2 = agoh.b(ProfilesTable.a().b(), (agmh) ProfilesTable.c.b, ParticipantsTable.c.a);
            b2.f = "profiles_table_join_tag";
            e.D(b2.a());
        }
        sjk a = sjm.a();
        a.c(new ncy(7));
        agog b3 = agoh.b(a.b(), (agmh) sjm.e.o, ParticipantsTable.c.q);
        b3.f = "contacts_table_join_tag";
        e.D(b3.a());
        akrh e2 = aktp.e("DefaultRecipientRepository.getAllRecipientParticipantsForConversationQuery_dsdrGroupsFlag");
        try {
            if (((okf) this.j.b()).a()) {
                e.g(new mvp(bugleConversationId, 18));
                b = e.b();
            } else {
                e.g(new mvp(bugleConversationId, 19));
                b = e.b();
            }
            e2.close();
            return b;
        } catch (Throwable th) {
            try {
                e2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final akul j(msh mshVar) {
        tay b;
        akrh e = aktp.e("getRecipientByMessagingIdentity");
        try {
            alog r = alog.r(mshVar);
            akrh e2 = aktp.e("getRecipientsByMessagingIdentity");
            try {
                int i = 1;
                d.t(!r.isEmpty(), "Set of input MIs for getRecipientsByMessagingIdentity cannot be empty.");
                if (oez.a() && oey.a()) {
                    taz e3 = ParticipantsTable.e();
                    e3.w("getRecipientsByMessagingIdentityQuery");
                    e3.g(new ndf(r, 5));
                    agog b2 = agoh.b(ProfilesTable.a().b(), (agmh) ProfilesTable.c.b, ParticipantsTable.c.a);
                    b2.f = "profiles_table_join_tag";
                    e3.D(b2.a());
                    b = e3.b();
                } else {
                    taz e4 = ParticipantsTable.e();
                    e4.w("getRecipientsByMessagingIdentityQuery");
                    e4.g(new ndf(r, 6));
                    b = e4.b();
                }
                akul h = b.s().h(new ndd(this, i), this.b);
                e2.b(h);
                e2.close();
                akul h2 = h.h(new ndd(mshVar, 3), this.b);
                e.b(h2);
                e.close();
                return h2;
            } finally {
            }
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final alog k(alog alogVar) {
        Stream map = Collection.EL.stream(((LinkedHashMap) Collection.EL.stream(alogVar).collect(Collectors.toMap(new ncy(6), Function$CC.identity(), new mcb(2), new mqr(16)))).values()).map(new mvp(this, 17));
        int i = alog.d;
        return (alog) map.collect(alls.a);
    }

    public final alor l(alog alogVar) {
        alok alokVar = new alok();
        Collection.EL.stream(alogVar).forEach(new ksn(this, alokVar, 8));
        return alokVar.b();
    }

    public final akul m(ndq ndqVar, mta mtaVar) {
        akrh e = aktp.e("updateUINormStatus");
        try {
            tbb f = ParticipantsTable.f();
            f.aj("updateUINormStatus");
            f.M(new mvp(ndqVar, 16));
            f.A(mtaVar);
            akul h = f.a().g().h(new mme(14), this.b);
            e.b(h);
            e.close();
            return h;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
