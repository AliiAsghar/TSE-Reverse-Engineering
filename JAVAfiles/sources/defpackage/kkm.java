package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kkm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ kkm(kkn kknVar, kkp kkpVar, List list, int i, Set set, int i2) {
        this.f = i2;
        this.b = kknVar;
        this.c = kkpVar;
        this.d = list;
        this.a = i;
        this.e = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // java.lang.Runnable
    public final void run() {
        List list;
        alog n;
        List list2;
        HashMap hashMap;
        Object obj;
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                amgl amglVar = (amgl) amgu.a.createBuilder();
                Object obj2 = this.d;
                ((mic) this.b).bl(this.c, (Integer) this.e, this.a, (amgc) obj2, amglVar);
                return;
            }
            for (int i2 = 0; i2 < this.a; i2++) {
                edz.l((View) ((ArrayList) this.d).get(i2), (String) ((ArrayList) this.b).get(i2));
                edz.l((View) ((ArrayList) this.e).get(i2), (String) ((ArrayList) this.c).get(i2));
            }
            return;
        }
        mka mkaVar = new mka();
        ConversationIdType conversationIdType = (ConversationIdType) this.d.get(this.a);
        double intValue = ((Integer) kkn.b.e()).intValue();
        Object obj3 = this.b;
        Object obj4 = this.c;
        try {
            int i3 = (int) (intValue * 1.5d);
            if (((kkp) obj4).b) {
                list = ((rwd) ((kkn) obj3).h.b()).F(conversationIdType, i3);
            } else {
                list = ((rwd) ((kkn) obj3).h.b()).B(conversationIdType, i3);
            }
        } catch (Exception e) {
            xyo e2 = kkn.g.e();
            e2.H("#getFullMessages: Failed to load messages for conversation");
            e2.b(conversationIdType);
            e2.r(e);
            list = null;
        }
        if (list == null) {
            int i4 = alog.d;
            n = alsx.a;
        } else {
            ArrayList arrayList = new ArrayList(((Integer) kkn.b.e()).intValue());
            ArrayList arrayList2 = new ArrayList(((Integer) kkn.b.e()).intValue());
            HashMap hashMap2 = new HashMap();
            int i5 = 0;
            int i6 = 0;
            while (i5 < list.size() && i6 < ((Integer) kkn.b.e()).intValue()) {
                kkn kknVar = (kkn) obj3;
                kkp kkpVar = (kkp) obj4;
                kkr a = kknVar.i.a(kkpVar, (MessageCoreData) list.get(i5), hashMap2);
                if (a != null) {
                    kkq kkqVar = kknVar.i;
                    double d = kkpVar.c;
                    if (d == 0.0d) {
                        list2 = list;
                        hashMap = hashMap2;
                        obj = obj3;
                    } else {
                        alog f = kkqVar.a.f(a.c.toString());
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            list2 = list;
                            alog alogVar = (alog) it.next();
                            Iterator it2 = it;
                            lga lgaVar = kkqVar.b;
                            hashMap = hashMap2;
                            obj = obj3;
                            if (lga.aO(alogVar, f)[alogVar.size()][((alsx) f).c] <= ((int) (Math.max(alogVar.size(), r7.c) * d))) {
                                break;
                            }
                            it = it2;
                            list = list2;
                            hashMap2 = hashMap;
                            obj3 = obj;
                        }
                        list2 = list;
                        hashMap = hashMap2;
                        obj = obj3;
                        arrayList2.add(f);
                    }
                    arrayList.add(a);
                    i6++;
                } else {
                    list2 = list;
                    hashMap = hashMap2;
                    obj = obj3;
                }
                i5++;
                list = list2;
                hashMap2 = hashMap;
                obj3 = obj;
            }
            n = alog.n(arrayList);
        }
        if (n.isEmpty()) {
            return;
        }
        if (!((Boolean) kkn.e.e()).booleanValue() || !((kkp) obj4).b) {
            String str = ((kkr) n.get(0)).a;
            for (int i7 = 1; i7 < n.size(); i7++) {
                kkr kkrVar = (kkr) n.get(i7);
                if (!((kkp) obj4).b && !kkrVar.e) {
                    kkn.g.q("#conversationSatisfiesRequest: request excludes sent message but message was sent");
                    return;
                } else {
                    if (!((Boolean) kkn.e.e()).booleanValue() && kkrVar.e && !TextUtils.equals(str, ((kkr) n.get(i7)).a)) {
                        kkn.g.q("#conversationSatifiesRequest: request excludes group conversations, but single participant conversation had multiple incoming destinations");
                        return;
                    }
                }
            }
        }
        ?? r2 = this.e;
        mkaVar.b(n);
        r2.add(mkaVar.a());
    }

    public /* synthetic */ kkm(mic micVar, MessageCoreData messageCoreData, Integer num, int i, amgc amgcVar, int i2) {
        this.f = i2;
        this.b = micVar;
        this.c = messageCoreData;
        this.e = num;
        this.a = i;
        this.d = amgcVar;
    }
}
