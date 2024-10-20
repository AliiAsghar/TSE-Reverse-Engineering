package defpackage;

import android.os.Parcel;
import android.util.Pair;
import com.google.android.rcs.client.messaging.data.GroupRemoteCapabilities;
import com.google.android.rcs.client.messaging.data.SubjectExtension;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ajpx implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ajpx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        int i = 4;
        switch (this.b) {
            case 0:
                ((ajur) this.a).a = Optional.of(Instant.ofEpochMilli(((advi) obj).a));
                return;
            case 1:
                abhi.j((Parcel) this.a, 6, ((aozb) obj).H(), false);
                return;
            case 2:
                abhi.j((Parcel) this.a, 3, ((aozb) obj).H(), false);
                return;
            case 3:
                abhi.j((Parcel) this.a, 4, ((aozb) obj).H(), false);
                return;
            case 4:
                ((alob) this.a).h((ajqb) obj);
                return;
            case 5:
                Pair pair = (Pair) obj;
                boolean equals = "NS".equals(pair.first);
                Object obj2 = this.a;
                if (equals) {
                    String str = (String) pair.second;
                    if (!albo.ah(str)) {
                        List c = anna.e(' ').i().c(str);
                        if (c.size() == 1) {
                            ((asmg) obj2).z("", str);
                            return;
                        }
                        if (c.size() == 2) {
                            String str2 = (String) c.get(0);
                            String str3 = (String) c.get(1);
                            if (str3.length() >= 3) {
                                ((asmg) obj2).z(str2, str3.substring(1, str3.length() - 1));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                String str4 = (String) pair.first;
                int indexOf = str4.indexOf(46);
                if (indexOf > 0) {
                    asmg asmgVar = (asmg) obj2;
                    String str5 = (String) asmgVar.v().b().get(str4.substring(0, indexOf));
                    if (str5 == null) {
                        str5 = "urn:ietf:params:cpim-headers:";
                    }
                    String substring = str4.substring(indexOf + 1);
                    arbj a = ajqb.a();
                    a.I(str5);
                    a.H(substring);
                    a.J((String) pair.second);
                    asmgVar.w(a.G());
                    return;
                }
                arbj a2 = ajqb.a();
                a2.H(str4);
                a2.J((String) pair.second);
                ((asmg) obj2).w(a2.G());
                return;
            case 6:
                Pair pair2 = (Pair) obj;
                boolean equals2 = ((String) pair2.first).equals("Content-Length");
                Object obj3 = this.a;
                if (equals2) {
                    ((anjs) obj3).a = Integer.parseInt((String) pair2.second);
                }
                ((anjs) obj3).f((String) pair2.first, (String) pair2.second);
                return;
            case 7:
                ajgk.D((Parcel) this.a, 4, (Instant) obj);
                return;
            case 8:
                ((ajur) this.a).j(Instant.ofEpochMilli(((advi) obj).a));
                return;
            case 9:
                ((Parcel) this.a).writeString((String) obj);
                return;
            case 10:
                Integer num = (Integer) obj;
                if (num != null) {
                    ((Parcel) this.a).writeInt(num.intValue());
                    return;
                }
                return;
            case 11:
                ajro.n((Parcel) this.a, 2, (Instant) obj);
                return;
            case 12:
                Iterable iterable = (Iterable) Collection.EL.stream((alpt) obj).map(new ajqy(i)).collect(alls.b);
                aozy aozyVar = (aozy) this.a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                wbs wbsVar = (wbs) aozyVar.b;
                apap apapVar = wbs.a;
                apao apaoVar = wbsVar.i;
                if (!apaoVar.c()) {
                    wbsVar.i = apag.mutableCopy(apaoVar);
                }
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    wbsVar.i.g(((wbp) it.next()).d);
                }
                return;
            case 13:
                SubjectExtension subjectExtension = (SubjectExtension) obj;
                algf algfVar = ajto.a;
                aozy createBuilder = wdt.a.createBuilder();
                wcz wczVar = (wcz) ajto.a.m().fu(subjectExtension.a().get());
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                wdt wdtVar = (wdt) createBuilder.b;
                wczVar.getClass();
                wdtVar.c = wczVar;
                wdtVar.b |= 1;
                apct b = apds.b(((Instant) subjectExtension.b().get()).toEpochMilli());
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj4 = this.a;
                wdt wdtVar2 = (wdt) createBuilder.b;
                b.getClass();
                wdtVar2.d = b;
                wdtVar2.b |= 2;
                wdt wdtVar3 = (wdt) createBuilder.s();
                aozy aozyVar2 = (aozy) obj4;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                wbx wbxVar = (wbx) aozyVar2.b;
                wbx wbxVar2 = wbx.a;
                wdtVar3.getClass();
                wbxVar.h = wdtVar3;
                wbxVar.b |= 16;
                return;
            case 14:
                GroupRemoteCapabilities groupRemoteCapabilities = (GroupRemoteCapabilities) obj;
                algf algfVar2 = ajto.a;
                aozy createBuilder2 = wbv.a.createBuilder();
                boolean c2 = groupRemoteCapabilities.c();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                wbv wbvVar = (wbv) createBuilder2.b;
                wbvVar.b |= 1;
                wbvVar.c = c2;
                if (groupRemoteCapabilities.a().isPresent() && ((Boolean) groupRemoteCapabilities.a().get()).booleanValue()) {
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    wbv wbvVar2 = (wbv) createBuilder2.b;
                    wbvVar2.d = 1;
                    wbvVar2.b |= 2;
                } else if (groupRemoteCapabilities.b().isPresent() && ((Boolean) groupRemoteCapabilities.b().get()).booleanValue()) {
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    wbv wbvVar3 = (wbv) createBuilder2.b;
                    wbvVar3.d = 2;
                    wbvVar3.b |= 2;
                } else {
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    wbv wbvVar4 = (wbv) createBuilder2.b;
                    wbvVar4.d = 0;
                    wbvVar4.b |= 2;
                }
                aozy aozyVar3 = (aozy) this.a;
                if (!aozyVar3.b.isMutable()) {
                    aozyVar3.u();
                }
                wbx wbxVar3 = (wbx) aozyVar3.b;
                wbv wbvVar5 = (wbv) createBuilder2.s();
                wbx wbxVar4 = wbx.a;
                wbvVar5.getClass();
                wbxVar3.g = wbvVar5;
                wbxVar3.b |= 8;
                return;
            case 15:
                apct j = aotl.j((Instant) obj);
                aozy aozyVar4 = (aozy) this.a;
                if (!aozyVar4.b.isMutable()) {
                    aozyVar4.u();
                }
                wca wcaVar = (wca) aozyVar4.b;
                apap apapVar2 = wca.a;
                j.getClass();
                wcaVar.h = j;
                wcaVar.c |= 8;
                return;
            case 16:
                wcp wcpVar = (wcp) obj;
                aozy aozyVar5 = (aozy) this.a;
                if (!aozyVar5.b.isMutable()) {
                    aozyVar5.u();
                }
                wcq wcqVar = (wcq) aozyVar5.b;
                wcq wcqVar2 = wcq.a;
                wcqVar.f = wcpVar.e;
                wcqVar.b |= 8;
                return;
            case 17:
                ((ArrayList) this.a).addAll((List) obj);
                return;
            case 18:
                alba albaVar = (alba) obj;
                aozy aozyVar6 = (aozy) this.a;
                if (!aozyVar6.b.isMutable()) {
                    aozyVar6.u();
                }
                alay alayVar = (alay) aozyVar6.b;
                alay alayVar2 = alay.a;
                albaVar.getClass();
                apax apaxVar = alayVar.c;
                if (!apaxVar.c()) {
                    alayVar.c = apag.mutableCopy(apaxVar);
                }
                alayVar.c.add(albaVar);
                return;
            case 19:
                String str6 = (String) obj;
                aozy aozyVar7 = (aozy) this.a;
                if (!aozyVar7.b.isMutable()) {
                    aozyVar7.u();
                }
                alba albaVar2 = (alba) aozyVar7.b;
                alba albaVar3 = alba.a;
                str6.getClass();
                albaVar2.d = str6;
                return;
            default:
                String str7 = (String) obj;
                aozy aozyVar8 = (aozy) this.a;
                if (!aozyVar8.b.isMutable()) {
                    aozyVar8.u();
                }
                alba albaVar4 = (alba) aozyVar8.b;
                alba albaVar5 = alba.a;
                str7.getClass();
                albaVar4.b |= 1;
                albaVar4.c = str7;
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            case 1:
                return Consumer$CC.$default$andThen(this, consumer);
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            case 3:
                return Consumer$CC.$default$andThen(this, consumer);
            case 4:
                return Consumer$CC.$default$andThen(this, consumer);
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            case 6:
                return Consumer$CC.$default$andThen(this, consumer);
            case 7:
                return Consumer$CC.$default$andThen(this, consumer);
            case 8:
                return Consumer$CC.$default$andThen(this, consumer);
            case 9:
                return Consumer$CC.$default$andThen(this, consumer);
            case 10:
                return Consumer$CC.$default$andThen(this, consumer);
            case 11:
                return Consumer$CC.$default$andThen(this, consumer);
            case 12:
                return Consumer$CC.$default$andThen(this, consumer);
            case 13:
                return Consumer$CC.$default$andThen(this, consumer);
            case 14:
                return Consumer$CC.$default$andThen(this, consumer);
            case 15:
                return Consumer$CC.$default$andThen(this, consumer);
            case 16:
                return Consumer$CC.$default$andThen(this, consumer);
            case 17:
                return Consumer$CC.$default$andThen(this, consumer);
            case 18:
                return Consumer$CC.$default$andThen(this, consumer);
            case 19:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }
}
