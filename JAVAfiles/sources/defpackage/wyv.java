package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class wyv implements wyt, xzh {
    public static final /* synthetic */ int b = 0;
    private static final xze c = xze.g("Bugle", "MmsSmsThreadIdResolver");
    private static final alwo d = alwo.o("Bugle");
    private static final alpt e = alpt.t("ʼUNKNOWN_SENDER!ʼ", "ʼWAP_PUSH_SI!ʼ", "EMERGENCY+SERVICE+PROVIDER", "EMERGENCY+SERVICE+PROVIDER+DEMO");
    private final Context f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final armf j;
    private final armf k;
    private final armf l;
    private final armf m;
    private final Map n = new HashMap();
    final Function a = new wmi(7);

    public wyv(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
        this.f = context;
        this.g = armfVar;
        this.h = armfVar2;
        this.i = armfVar3;
        this.j = armfVar4;
        this.k = armfVar5;
        this.l = armfVar6;
        this.m = armfVar7;
    }

    private static String k(ParticipantsTable.BindData bindData) {
        if (e.contains(bindData.P())) {
            return bindData.P();
        }
        return bindData.J();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean m(Collection collection, Collection collection2) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
            alur it2 = ((alog) collection2).iterator();
            while (it2.hasNext()) {
                ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) it2.next();
                if (ryg.l(bindData2) || !TextUtils.equals(bindData.O(), bindData2.O())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.wyt
    public final long a(wxs wxsVar, String str) {
        xyl.h();
        ((wxt) this.l.b()).a(wxsVar);
        if (TextUtils.isEmpty(str)) {
            alwl alwlVar = (alwl) d.h();
            alwlVar.Z(alwk.FULL);
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "resolveFromRecipient", 248, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.resolveFromRecipient returned invalid thread id because the recipient parameter was a null recipient");
            return -1L;
        }
        ParticipantsTable.BindData b2 = rxn.b(str);
        xyl.h();
        if (b2 == null) {
            alwl alwlVar2 = (alwl) d.h();
            alwlVar2.Z(alwk.FULL);
            ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "resolveFromParticipant", 306, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.resolveFromParticipant returned invalid thread id because the participant parameter was a null participant");
            return -1L;
        }
        return j(wxsVar, Collections.singleton(b2));
    }

    @Override // defpackage.wyt
    public final long b(ConversationIdType conversationIdType) {
        xyl.h();
        try {
            if (((Boolean) qpf.a.e()).booleanValue()) {
                return ((qos) this.k.b()).a(conversationIdType).a();
            }
            List K = ((rtz) this.g.b()).K(conversationIdType);
            if (K.isEmpty()) {
                alwl alwlVar = (alwl) d.h();
                alwlVar.Z(alwk.FULL);
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "safeResolveFromConversationId", 336, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.safeResolveFromConversationId can't resolve a conversation with no recipients");
                return -1L;
            }
            i();
            return d(K);
        } catch (IllegalArgumentException | SecurityException | vjg e2) {
            ((alwl) ((alwl) ((alwl) d.h()).g(e2)).h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "safeResolveFromConversationId", (char) 345, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.safeResolveFromConversationId failed because of some runtime exceptions");
            return -1L;
        }
    }

    @Override // defpackage.wyt
    public final long c(ParticipantsTable.BindData bindData) {
        xyl.h();
        if (bindData == null) {
            alwl alwlVar = (alwl) d.h();
            alwlVar.Z(alwk.FULL);
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "safeResolveFromParticipant", 155, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.safeResolveFromParticipant returned invalid thread id because parameter was a null participant");
            return -1L;
        }
        return d(Collections.singleton(bindData));
    }

    @Override // defpackage.wyt
    public final long d(Collection collection) {
        xyl.h();
        try {
            return j(wym.a, collection);
        } catch (IllegalArgumentException | SecurityException | vjg e2) {
            ((alwl) ((alwl) ((alwl) d.h()).g(e2)).h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "safeResolveFromParticipants", (char) 206, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.safeResolveFromParticipants failed");
            return -1L;
        }
    }

    @Override // defpackage.wyt
    public final /* synthetic */ long e(String str) {
        return f(wym.a, str);
    }

    @Override // defpackage.wyt
    public final long f(wxs wxsVar, String str) {
        xyl.h();
        ((wxt) this.l.b()).a(wxsVar);
        if (TextUtils.isEmpty(str)) {
            alwl alwlVar = (alwl) d.h();
            alwlVar.Z(alwk.FULL);
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "safeResolveFromRecipient", 181, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.safeResolveFromRecipient returned invalid thread id because parameter was a null recipient");
            return -1L;
        }
        return h(wxsVar, Collections.singleton(str));
    }

    @Override // defpackage.wyt
    public final /* synthetic */ long g(Collection collection) {
        return h(wym.a, collection);
    }

    @Override // defpackage.wyt
    public final long h(wxs wxsVar, Collection collection) {
        xyl.h();
        ((wxt) this.l.b()).a(wxsVar);
        try {
            akrh e2 = aktp.e("MmsSmsThreadIdResolver.resolveFromRecipients");
            try {
                xyl.h();
                ((wxt) this.l.b()).a(wxsVar);
                if (collection != null && !collection.isEmpty()) {
                    ArrayList arrayList = new ArrayList(collection.size());
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (TextUtils.isEmpty(str)) {
                            c.q("empty recipient");
                        } else {
                            arrayList.add(rxn.b(str));
                        }
                    }
                    long j = j(wxsVar, arrayList);
                    e2.close();
                    return j;
                }
                alwl alwlVar = (alwl) d.h();
                alwlVar.Z(alwk.FULL);
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "resolveFromRecipients", 274, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.resolveFromRecipients returned invalid thread id because the recipients parameter was an empty collection of recipients");
                e2.close();
                return -1L;
            } catch (Throwable th) {
                try {
                    e2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalArgumentException | SecurityException | vjg e3) {
            ((alwl) ((alwl) ((alwl) d.h()).g(e3)).h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "safeResolveFromRecipients", (char) 230, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.safeResolveFromRecipients failed because of some runtime exceptions");
            return -1L;
        }
    }

    @Override // defpackage.wyt
    public final void i() {
        synchronized (this.n) {
            this.n.clear();
        }
    }

    public final long j(wxs wxsVar, Collection collection) {
        String join;
        Long l;
        long j;
        wyu wyuVar;
        ((wxt) this.l.b()).a(wxsVar);
        if (collection.size() == 1) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) collection.iterator().next();
            if (bindData != null) {
                join = bindData.O();
            } else {
                join = "null";
            }
        } else {
            join = TextUtils.join(",", (List) Collection.EL.stream(collection).map(this.a).sorted().collect(Collectors.toCollection(new wso(8))));
        }
        synchronized (this.n) {
            l = (Long) this.n.get(join);
        }
        if (l == null) {
            if (collection != null && !collection.isEmpty()) {
                if (collection.size() == 1) {
                    ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) collection.iterator().next();
                    String P = bindData2.P();
                    String k = k(bindData2);
                    boolean equals = TextUtils.equals(P, k);
                    xyo a = c.a();
                    a.H("get candidate thread Ids.");
                    a.L("sendDestination", P);
                    a.L("displayDestination", k);
                    a.A("equal destinations", equals);
                    a.q();
                    wyuVar = (wyu) this.j.b();
                    wzs wzsVar = (wzs) this.h.b();
                    qqq b2 = ((qxr) this.m.b()).b();
                    wyuVar.a = wzsVar.h(this.f, wxsVar, P, b2);
                    if (!equals && !TextUtils.isEmpty(k)) {
                        wyuVar.b = wzsVar.h(this.f, wxsVar, k, b2);
                    } else {
                        wyuVar.b = wyuVar.a;
                    }
                } else {
                    wyuVar = (wyu) this.j.b();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ParticipantsTable.BindData) it.next()).P());
                    }
                    ArrayList arrayList2 = new ArrayList(collection.size());
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(k((ParticipantsTable.BindData) it2.next()));
                    }
                    wzs wzsVar2 = (wzs) this.h.b();
                    qqq b3 = ((qxr) this.m.b()).b();
                    wyuVar.a = wzsVar2.i(this.f, wxsVar, arrayList, b3);
                    wyuVar.b = wzsVar2.i(this.f, wxsVar, arrayList2, b3);
                }
                xze xzeVar = c;
                xyo a2 = xzeVar.a();
                a2.H("resolve from");
                a2.K("participants", collection);
                a2.y("idForSendDestinations", wyuVar.a);
                a2.y("idForDisplayDestinations", wyuVar.b);
                a2.q();
                j = wyuVar.a;
                if (j != wyuVar.b) {
                    if (m(collection, wyuVar.a(j))) {
                        xyo a3 = xzeVar.a();
                        a3.H("resolve using idForSendDestinations:");
                        a3.G(wyuVar.a);
                        a3.q();
                        ((mbl) this.i.b()).c("Bugle.Datamodel.ResolveThreadIdWithSendDestinations.Counts");
                        j = wyuVar.a;
                    } else {
                        java.util.Collection a4 = wyuVar.a(wyuVar.b);
                        if (m(collection, a4)) {
                            xyo a5 = xzeVar.a();
                            a5.H("resolve using idForDisplayDestinations:");
                            a5.G(wyuVar.b);
                            a5.q();
                            ((mbl) this.i.b()).e("Bugle.Datamodel.ResolveThreadIdWithDisplayDestinations.Counts", 1);
                            j = wyuVar.b;
                        } else if (a4.isEmpty()) {
                            xyo a6 = xzeVar.a();
                            a6.H("resolve for empty displayDestinationParticipants.");
                            a6.y("idForDisplayDestinations", wyuVar.b);
                            a6.q();
                            ((mbl) this.i.b()).e("Bugle.Datamodel.ResolveThreadIdWithDisplayDestinations.Counts", 2);
                            j = wyuVar.b;
                        } else {
                            xyo a7 = xzeVar.a();
                            a7.H("resolve for non-empty displayDestinationParticipants.");
                            a7.y("idForSendDestinations", wyuVar.a);
                            a7.q();
                            ((mbl) this.i.b()).c("Bugle.Datamodel.ResolveThreadIdWithSendDestinations.Counts");
                            j = wyuVar.a;
                        }
                    }
                }
            } else {
                alwl alwlVar = (alwl) d.h();
                alwlVar.Z(alwk.FULL);
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "resolveFromParticipants", 401, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.resolveFromParticipants returned invalid thread id because the participants parameter was an empty collection of participants");
                j = -1;
            }
            Map map = this.n;
            Long valueOf = Long.valueOf(j);
            synchronized (map) {
                this.n.put(join, valueOf);
            }
            valueOf.getClass();
            return j;
        }
        return l.longValue();
    }

    @Override // defpackage.xzh
    public final void l(int i) {
        i();
    }
}
