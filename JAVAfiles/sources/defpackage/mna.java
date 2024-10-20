package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mna implements mnb {
    public static final alwo a = alwo.o("BugleWearable");
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    private final armf f;
    private final armf g;
    private final armf h;

    public mna(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        this.b = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.c = armfVar4;
        this.h = armfVar5;
        this.d = armfVar6;
        this.e = armfVar7;
    }

    @Override // defpackage.mnb
    public final akul a(ConversationId conversationId, mmy mmyVar) {
        akul c;
        mmyVar.getClass();
        Object b = this.f.b();
        b.getClass();
        c = qjh.c((arwe) b, arpj.a, arwf.a, new mmz(conversationId, mmyVar, this, (arpe) null, 0));
        return c;
    }

    @Override // defpackage.mnb
    public final Object b(ConversationIdType conversationIdType, List list, boolean z, arpe arpeVar) {
        Object b = this.g.b();
        b.getClass();
        return arro.q((arpi) b, new kcw(this, z, list, conversationIdType, (arpe) null, 3), arpeVar);
    }

    @Override // defpackage.mnb
    public final boolean c(ConversationIdType conversationIdType, List list, boolean z) {
        Map map;
        boolean z2;
        boolean z3;
        conversationIdType.getClass();
        list.getClass();
        aiut.b();
        if (((vco) this.e.b()).i()) {
            if (z) {
                ArrayList arrayList = new ArrayList(aqjn.J(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(uxi.a((msh) it.next()));
                }
                HashSet ai = aqjn.ai(arrayList);
                try {
                    acbz acbzVar = (acbz) this.h.b();
                    ArrayList arrayList2 = new ArrayList(aqjn.J(ai, 10));
                    Iterator it2 = ai.iterator();
                    while (it2.hasNext()) {
                        Uri build = new Uri.Builder().scheme("sms").opaquePart((String) it2.next()).build();
                        build.getClass();
                        arrayList2.add(build);
                    }
                    Object u = actx.u(acbzVar.a(aqjn.ai(arrayList2)));
                    u.getClass();
                    map = uxi.b((Map) u);
                } catch (Exception unused) {
                    alwl alwlVar = (alwl) a.i();
                    alwlVar.X(ydl.M, "ConversationTrustedContactsApi");
                    alwlVar.q("Exception thrown by the Family Link API when querying areAllowed");
                    LinkedHashMap linkedHashMap = new LinkedHashMap(arrn.r(aqjn.i(aqjn.J(ai, 10)), 16));
                    for (Object obj : ai) {
                        linkedHashMap.put(obj, false);
                    }
                    map = linkedHashMap;
                }
                Collection values = map.values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it3 = values.iterator();
                    while (it3.hasNext()) {
                        if (!((Boolean) it3.next()).booleanValue()) {
                            z2 = false;
                            break;
                        }
                    }
                }
                z2 = true;
                if (!list.isEmpty()) {
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        if (!((msh) it4.next()).v()) {
                            z3 = false;
                            break;
                        }
                    }
                }
                z3 = true;
                if (z2 || z3) {
                    return true;
                }
                return false;
            }
            return lpg.w(conversationIdType);
        }
        alwl alwlVar2 = (alwl) a.g();
        alwlVar2.X(ydl.M, "ConversationTrustedContactsApi");
        alwlVar2.q("Devices not under supervision, conversation is always allowed.");
        return true;
    }
}
