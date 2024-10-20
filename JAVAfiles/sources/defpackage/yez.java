package defpackage;

import android.text.TextUtils;
import com.google.android.gms.constellation.PhoneNumberInfo;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class yez implements algk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ yez(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.function.Consumer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        Object apply;
        int i = 3;
        boolean z = true;
        yub yubVar = null;
        int i2 = 0;
        switch (this.b) {
            case 0:
                yey yeyVar = (yey) obj;
                aozy builder = yeyVar.toBuilder();
                yew yewVar = yeyVar.f;
                if (yewVar == null) {
                    yewVar = yew.a;
                }
                Object obj2 = this.a;
                aozy builder2 = yewVar.toBuilder();
                apct j = aotl.j((Instant) obj2);
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                yew yewVar2 = (yew) builder2.b;
                j.getClass();
                yewVar2.c = j;
                yewVar2.b |= 1;
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                yey yeyVar2 = (yey) builder.b;
                yew yewVar3 = (yew) builder2.s();
                yewVar3.getClass();
                yeyVar2.f = yewVar3;
                yeyVar2.b |= 8;
                return (yey) builder.s();
            case 1:
                this.a.q(obj);
                return null;
            case 2:
                if (((xnv) ((zas) this.a).i).f().toEpochMilli() - ((Long) obj).longValue() >= 259200000) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                return ((yin) this.a).e((aldb) obj);
            case 4:
                return ((yin) this.a).i((Optional) obj);
            case 5:
                alvw i3 = yin.a.i();
                i3.X(alwp.a, "Bugle");
                ((alvg) ((alvg) ((alvg) i3).g((FileNotFoundException) obj)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "readModelBasedProviderConfigsFromFile", 639, "SmartSuggestionConfigUtils.java")).t("Could not find file: %s", albo.g((alcs) this.a));
                int i4 = alog.d;
                return alsx.a;
            case 6:
                alvw i5 = yin.a.i();
                i5.X(alwp.a, "Bugle");
                ((alvg) ((alvg) ((alvg) i5).g((IOException) obj)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "readModelBasedProviderConfigsFromFile", 648, "SmartSuggestionConfigUtils.java")).t("Error reading FileSpec: %s", albo.g((alcs) this.a));
                int i6 = alog.d;
                return alsx.a;
            case 7:
                aldo aldoVar = (aldo) obj;
                aozy j2 = ((yin) this.a).j();
                if (!j2.b.isMutable()) {
                    j2.u();
                }
                aldi aldiVar = (aldi) j2.b;
                aldi aldiVar2 = aldi.a;
                aldoVar.getClass();
                aldiVar.f = aldoVar;
                aldiVar.b |= 8;
                return (aldi) j2.s();
            case 8:
                alvw i7 = yin.a.i();
                i7.X(alwp.a, "Bugle");
                ((alvg) ((alvg) ((alvg) i7).g((FileNotFoundException) obj)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetDownloadedLinguaModelConfigAsync", 1171, "SmartSuggestionConfigUtils.java")).t("Could not find file: %s", albo.g((alcs) ((alog) this.a).get(0)));
                return Optional.empty();
            case 9:
                alvw i8 = yin.a.i();
                i8.X(alwp.a, "Bugle");
                ((alvg) ((alvg) ((alvg) i8).g((IOException) obj)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetDownloadedLinguaModelConfigAsync", 1180, "SmartSuggestionConfigUtils.java")).t("Error reading FileSpec: %s", albo.g((alcs) ((alog) this.a).get(0)));
                return Optional.empty();
            case 10:
                return this.a.a(obj);
            case 11:
                arml armlVar = ymt.a;
                this.a.a(obj);
                return null;
            case 12:
                ((adve) this.a).c = (ahjj) obj;
                return null;
            case 13:
                Optional optional = (Optional) obj;
                if (optional == null || optional.isEmpty()) {
                    return false;
                }
                Object obj3 = this.a;
                yub yubVar2 = (yub) optional.get();
                ytl ytlVar = (ytl) obj3;
                long epochMilli = ytlVar.h.f().toEpochMilli() - yubVar2.c;
                if (epochMilli > ((Long) ytl.b.e()).longValue()) {
                    long longValue = epochMilli - ((Long) ytl.b.e()).longValue();
                    ytlVar.i.g("Bugle.VerifiedSms.KeyRotation.KeyExpiryAge", longValue);
                    xyo c = ytl.g.c();
                    c.H("Key exists for IMSI but has expired");
                    c.M("last registration time", Long.valueOf(yubVar2.c));
                    c.M("expired by ms", Long.valueOf(longValue));
                    c.q();
                    return false;
                }
                return true;
            case 14:
                Stream stream = Collection.EL.stream((alog) obj);
                ?? r1 = this.a;
                Optional findFirst = stream.filter(new xdm(r1, 17)).findFirst();
                if (findFirst.isEmpty()) {
                    xyo e = ytw.a.e();
                    e.H("Unable to find C11N phone number for key rotation");
                    e.w("msisdn", r1, 2);
                    e.q();
                    return Optional.empty();
                }
                String d = ytw.d((PhoneNumberInfo) findFirst.get());
                if (TextUtils.isEmpty(d)) {
                    xyo e2 = ytw.a.e();
                    e2.H("Unable to find C11N token in the results for key rotation");
                    e2.w("msisdn", r1, 2);
                    e2.q();
                    return Optional.empty();
                }
                return Optional.of(d);
            case 15:
                yuf yufVar = (yuf) obj;
                alnr alnrVar = yul.a;
                Object obj4 = this.a;
                if (yufVar.a((String) obj4)) {
                    obj4.getClass();
                    apbo apboVar = yufVar.d;
                    if (apboVar.containsKey(obj4)) {
                        String str = (String) apboVar.get(obj4);
                        yubVar = yub.a;
                        str.getClass();
                        apbo apboVar2 = yufVar.e;
                        if (apboVar2.containsKey(str)) {
                            yubVar = (yub) apboVar2.get(str);
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                return Optional.ofNullable(yubVar).filter(new ytt(i));
            case 16:
                apply = this.a.apply((yuf) obj);
                return (yuf) apply;
            case 17:
                Stream map = Collection.EL.stream(this.a).map(new yec((ansm) obj, 20));
                int i9 = alog.d;
                return (alog) map.collect(alls.a);
            case 18:
                return yup.e((yum) this.a, (ansm) obj);
            default:
                List list = (List) obj;
                alok alokVar = new alok();
                while (true) {
                    alog alogVar = (alog) this.a;
                    if (i2 < alogVar.size()) {
                        alokVar.h((String) alogVar.get(i2), (List) Collection.EL.stream((List) list.get(i2)).map(new yug(i)).collect(alls.a));
                        i2++;
                    } else {
                        return alokVar.b();
                    }
                }
        }
    }
}
