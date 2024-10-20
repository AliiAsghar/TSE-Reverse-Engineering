package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.GroupChatSessionEvent;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Set;
import java.util.function.Consumer;
import org.apache.http.Header;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class acsa implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ acsa(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [adfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        RcsDestinationId i;
        switch (this.b) {
            case 0:
                ((actq) this.a).e((String) obj);
                return;
            case 1:
                ((Set) obj).add(((acpv) this.a).a.d());
                return;
            case 2:
                Header header = (Header) obj;
                advp advpVar = acta.a;
                this.a.add(String.format("%s: %s", header.getName(), advq.GENERIC.c(header.getValue())));
                return;
            case 3:
                int i2 = acts.a;
                ((Bundle) this.a).putString(RcsIntents.EXTRA_PREVIEW_CONTENT_TYPE, (String) obj);
                return;
            case 4:
                int i3 = acts.a;
                ((Bundle) this.a).putByteArray(RcsIntents.EXTRA_PREVIEW_DATA, (byte[]) obj);
                return;
            case 5:
                int i4 = acts.a;
                ((Bundle) this.a).putString("rcs.intent.extra.uri", ((Uri) obj).toString());
                return;
            case 6:
                int i5 = acts.a;
                ((Bundle) this.a).putLong(RcsIntents.EXTRA_EXPIRY, ((Long) obj).longValue());
                return;
            case 7:
                int i6 = acts.a;
                ((Bundle) this.a).putByteArray(RcsIntents.EXTRA_RAW_FILE_TRANSFER_XML_BYTES, (byte[]) obj);
                return;
            case 8:
                Optional of = Optional.of((String) obj);
                adsh adshVar = (adsh) this.a;
                adshVar.h = of;
                new GroupChatSessionEvent(adshVar);
                return;
            case 9:
                ((Set) obj).add(((acza) this.a).a.d());
                return;
            case 10:
                acpk acpkVar = (acpk) obj;
                ?? r0 = this.a;
                acyz acyzVar = adas.a;
                if (!TextUtils.equals(acpkVar.g, r0)) {
                    acpkVar.g = (String) r0;
                    return;
                }
                return;
            case 11:
                ((ajqh) this.a).e(adcx.x((String) obj));
                return;
            case 12:
                acph acphVar = (acph) obj;
                ajur ajurVar = new ajur(null, null, null);
                try {
                    String str = acphVar.a;
                    if (str.startsWith("sip:")) {
                        atkv atkvVar = new atkv((byte[]) null);
                        atkvVar.j(str);
                        atkvVar.k(2);
                        i = atkvVar.i();
                    } else if (str.startsWith("tel:")) {
                        atkv atkvVar2 = new atkv((byte[]) null);
                        atkvVar2.j(str.substring(4));
                        atkvVar2.k(1);
                        i = atkvVar2.i();
                    } else {
                        throw new IllegalArgumentException("URI format not supported");
                    }
                    ajurVar.i(i);
                } catch (IllegalArgumentException unused) {
                }
                Object obj2 = this.a;
                acphVar.b.ifPresent(new ajpx(ajurVar, 8));
                ((anzh) obj2).h(ajurVar.h());
                return;
            case 13:
                ContentType contentType = addi.e;
                ((asmg) this.a).y("urn:ietf:params:imdn", "Disposition-Notification", (String) obj);
                return;
            case 14:
                ajqb ajqbVar = (ajqb) obj;
                arbj arbjVar = new arbj();
                arbjVar.r(ajqbVar.a);
                arbjVar.q(ajqbVar.b);
                arbjVar.s(ajqbVar.c);
                ((alob) this.a).h(arbjVar.p());
                return;
            case 15:
                acyz acyzVar2 = adeq.a;
                boolean hasActiveRegistration = ((acoh) obj).hasActiveRegistration();
                aozy aozyVar = (aozy) this.a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                apfy apfyVar = (apfy) aozyVar.b;
                apfy apfyVar2 = apfy.a;
                apfyVar.b |= 4096;
                apfyVar.o = hasActiveRegistration;
                return;
            case 16:
                acyz acyzVar3 = adet.a;
                ((adfg) obj).a(this.a.a());
                return;
            case 17:
                ((afxz) this.a).g((adey) obj);
                return;
            case 18:
                apgf a = adfs.a((String) obj);
                aozy aozyVar2 = (aozy) this.a;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                apgk apgkVar = (apgk) aozyVar2.b;
                apgk apgkVar2 = apgk.a;
                a.getClass();
                apao apaoVar = apgkVar.c;
                if (!apaoVar.c()) {
                    apgkVar.c = apag.mutableCopy(apaoVar);
                }
                apgkVar.c.g(a.z);
                return;
            case 19:
                apgf a2 = adfs.a((String) obj);
                aozy aozyVar3 = (aozy) this.a;
                if (!aozyVar3.b.isMutable()) {
                    aozyVar3.u();
                }
                apgz apgzVar = (apgz) aozyVar3.b;
                apgz apgzVar2 = apgz.a;
                a2.getClass();
                apao apaoVar2 = apgzVar.b;
                if (!apaoVar2.c()) {
                    apgzVar.b = apag.mutableCopy(apaoVar2);
                }
                apgzVar.b.g(a2.z);
                return;
            default:
                apgf a3 = adfs.a((String) obj);
                aozy aozyVar4 = (aozy) this.a;
                if (!aozyVar4.b.isMutable()) {
                    aozyVar4.u();
                }
                apgz apgzVar3 = (apgz) aozyVar4.b;
                apgz apgzVar4 = apgz.a;
                a3.getClass();
                apao apaoVar3 = apgzVar3.c;
                if (!apaoVar3.c()) {
                    apgzVar3.c = apag.mutableCopy(apaoVar3);
                }
                apgzVar3.c.g(a3.z);
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
