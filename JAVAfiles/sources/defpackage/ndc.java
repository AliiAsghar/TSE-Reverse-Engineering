package defpackage;

import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ndc implements Function {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ ndc(ndi ndiVar, akrh akrhVar, ndq ndqVar, vov vovVar, int i) {
        this.e = i;
        this.a = ndiVar;
        this.b = akrhVar;
        this.d = ndqVar;
        this.c = vovVar;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return Function$CC.$default$andThen(this, function);
                }
                return Function$CC.$default$andThen(this, function);
            }
            return Function$CC.$default$andThen(this, function);
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Integer valueOf;
        Integer valueOf2;
        Object obj2;
        int i;
        int i2 = this.e;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    qqk qqkVar = (qqk) obj;
                    Object obj3 = qql.b.a;
                    Object obj4 = this.a;
                    agmh agmhVar = (agmh) obj3;
                    qqkVar.W(((qqw) this.d).t(agmhVar, (String) this.c, (String) this.b, (qqq) obj4));
                    return qqkVar;
                }
                qqb qqbVar = (qqb) obj;
                Object obj5 = qqc.b.a;
                Object obj6 = this.a;
                agmh agmhVar2 = (agmh) obj5;
                qqbVar.W(((qqw) this.d).t(agmhVar2, (String) this.c, (String) this.b, (qqq) obj6));
                return qqbVar;
            }
            MessageCoreData messageCoreData = (MessageCoreData) obj;
            ajli ajliVar = new ajli();
            if (messageCoreData != null) {
                Object obj7 = this.d;
                Object obj8 = this.b;
                Object obj9 = this.a;
                Object obj10 = this.c;
                ajliVar.c = messageCoreData;
                ajliVar.d = obj10;
                ajliVar.a = ((imj) obj9).b;
                ((Optional) obj8).ifPresentOrElse(new iqp(obj7, (Object) messageCoreData, (Object) ajliVar, 1, (byte[]) null), new gtq(messageCoreData, 14));
                ?? r10 = ajliVar.c;
                if (r10 != 0 && (obj2 = ajliVar.d) != null && (i = ajliVar.a) != 0) {
                    return new ime(r10, (rto) obj2, i, (RepliedToDataAdapter) ajliVar.b);
                }
                StringBuilder sb = new StringBuilder();
                if (ajliVar.c == null) {
                    sb.append(" message");
                }
                if (ajliVar.d == null) {
                    sb.append(" conversation");
                }
                if (ajliVar.a == 0) {
                    sb.append(" source");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            throw new NullPointerException("Null message");
        }
        nfn nfnVar = (nfn) obj;
        tbb f = ParticipantsTable.f();
        f.aj("updatePhotoPreference");
        f.M(new ndf(this.d, 11));
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 60060) {
            agnc.t("profile_photo_user_preference", intValue2);
        }
        if (intValue >= 60060) {
            Object obj11 = this.c;
            if (obj11 == null) {
                f.a.putNull("profile_photo_user_preference");
            } else {
                f.a.put("profile_photo_user_preference", Integer.valueOf(((vov) obj11).a()));
            }
        }
        Object obj12 = this.b;
        akul i3 = f.a().g().i(new lso(nfnVar, 17), ((ndi) this.a).b);
        ((akrh) obj12).b(i3);
        return i3;
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return Function$CC.$default$compose(this, function);
                }
                return Function$CC.$default$compose(this, function);
            }
            return Function$CC.$default$compose(this, function);
        }
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ ndc(qqw qqwVar, String str, String str2, qqq qqqVar, int i) {
        this.e = i;
        this.d = qqwVar;
        this.c = str;
        this.b = str2;
        this.a = qqqVar;
    }

    public /* synthetic */ ndc(rto rtoVar, imj imjVar, Optional optional, iml imlVar, int i) {
        this.e = i;
        this.c = rtoVar;
        this.a = imjVar;
        this.b = optional;
        this.d = imlVar;
    }
}
