package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adcl extends apyn {
    private final apyi b;
    private final apyi c;
    private final apyi d;
    private final apyi e;

    public adcl(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2, apyi apyiVar3, apyi apyiVar4) {
        super(armfVar2, new apyv(adcl.class), armfVar);
        this.b = apys.c(apyiVar);
        this.c = apys.c(apyiVar2);
        this.d = apys.c(apyiVar3);
        this.e = apys.c(apyiVar4);
    }

    @Override // defpackage.apyn
    public final /* synthetic */ ListenableFuture b(Object obj) {
        String str;
        boolean equals;
        long length;
        Object a;
        List list = (List) obj;
        ajpw ajpwVar = (ajpw) list.get(0);
        addi addiVar = (addi) list.get(1);
        addv addvVar = (addv) list.get(2);
        adaw adawVar = (adaw) list.get(3);
        ajqg ajqgVar = ajpwVar.b;
        Conversation conversation = ajpwVar.a;
        advr.d(adck.a, "Sending SLM file message [%s] in new SLM session [%s]", ajqgVar.a, conversation);
        String y = adcx.y(ajqgVar.b);
        if (ajqgVar.c.isPresent()) {
            str = adcx.y((RcsDestinationId) ajqgVar.c.get());
        } else {
            str = "sip:anonymous@anonymous.invalid";
        }
        String str2 = (String) addi.f.get("urn:ietf:params:imdn");
        str2.getClass();
        asmg e = ajpz.e();
        e.z(str2, "urn:ietf:params:imdn");
        e.x("From", new aife(y).toString());
        e.x("To", new aife(str).toString());
        e.x("DateTime", addiVar.h.f().toString());
        e.y("urn:ietf:params:imdn", "Message-ID", ajqgVar.a);
        aifa aifaVar = addiVar.j;
        Uri uri = ajqgVar.d.b;
        String scheme = uri.getScheme();
        if (scheme == null) {
            equals = false;
        } else {
            equals = TextUtils.equals(scheme.trim().toLowerCase(Locale.US), "content");
        }
        d.t(equals, "expected uri to be a Content Uri");
        Context context = aifaVar.b;
        AssetFileDescriptor a2 = aipx.a(context, uri, "r", aifb.c(uri));
        if (a2 == null) {
            advr.r(aifa.a, "Failed to open AFD for length of contentUri: %s", advq.URI.c(uri.toString()));
            length = 0;
        } else {
            length = a2.getLength();
            a2.close();
        }
        aifb aifbVar = new aifb(context, uri, length);
        anjs c = ajqa.c();
        c.h(aifbVar);
        c.f(assi.a, ajqgVar.d.a.toString());
        c.f(assi.c, "attachment");
        c.f("Content-Length", String.valueOf(aifbVar.a));
        e.a = c.d();
        ajpz u = e.u();
        if (ajqgVar.c.isPresent()) {
            a = ajqgVar.c.get();
        } else {
            a = conversation.a();
        }
        RcsDestinationId rcsDestinationId = ajqgVar.b;
        String y2 = adcx.y((RcsDestinationId) a);
        String y3 = adcx.y(rcsDestinationId);
        adqu adquVar = new adqu(adqt.CPIM_MESSAGE, 2);
        adquVar.f(addi.e.toString(), u);
        adquVar.b = y2;
        adquVar.c = y3;
        adquVar.k = ajqgVar.a;
        adquVar.j = addiVar.h.f().toEpochMilli();
        adquVar.r = false;
        return adawVar.a(conversation, adquVar, addvVar.createOutgoingSlmSession(adcx.y(conversation.a()))).p(adquVar);
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        apyi apyiVar = this.e;
        apyi apyiVar2 = this.d;
        return albo.bF(this.b.d(), this.c.d(), apyiVar2.d(), apyiVar.d());
    }
}
