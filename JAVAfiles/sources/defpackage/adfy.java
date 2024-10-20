package defpackage;

import android.telephony.ims.SipMessage;
import android.telephony.ims.stub.DelegateConnectionMessageCallback;
import android.text.TextUtils;
import com.android.vcard.VCardBuilder;
import j$.util.DesugarArrays;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adfy implements DelegateConnectionMessageCallback {
    private final adgp a;
    private final String b;
    private final adih c;

    public adfy(adgp adgpVar, adih adihVar, String str) {
        this.a = adgpVar;
        this.c = adihVar;
        this.b = str;
    }

    public final void onMessageReceived(SipMessage sipMessage) {
        try {
            advr.l(this.a.i, "Message received. Actual content length:%d [%s]", Integer.valueOf(sipMessage.getContent().length), advq.MESSAGE_CONTENT.c("\n" + sipMessage.getStartLine() + sipMessage.getHeaderSection() + VCardBuilder.VCARD_END_OF_LINE + new String(sipMessage.getContent(), "UTF-8")));
        } catch (UnsupportedEncodingException unused) {
            advr.h(this.a.i, "Failed to decode SipMessage.", new Object[0]);
        }
        int i = 3;
        if (this.a.I.isPresent()) {
            this.a.I.get();
            String startLine = sipMessage.getStartLine();
            String headerSection = sipMessage.getHeaderSection();
            if (sipMessage.getStartLine().startsWith("NOTIFY") && (sipMessage.getHeaderSection().contains("Event: conference") || sipMessage.getHeaderSection().contains("o: conference"))) {
                Integer num = (Integer) DesugarArrays.stream(headerSection.split("[\\r\\n]")).filter(new addf(i)).findFirst().map(new addg(11)).orElse(0);
                int intValue = num.intValue();
                advr.c("Content length: %d", num);
                if (sipMessage.getContent().length >= intValue) {
                    advr.c("Content is same or longer than content length", new Object[0]);
                } else {
                    String str = (String) DesugarArrays.stream(headerSection.split("[\\r\\n]")).filter(new addf(4)).findFirst().map(new addg(12)).orElse("");
                    advr.c("Boundary: %s", str);
                    if (str.isEmpty()) {
                        advr.q("No boundary is found in Content-Type header.", new Object[0]);
                    } else {
                        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                        advr.q("Adding %d padding bytes to SipMessage's content.", Integer.valueOf(intValue - sipMessage.getContent().length));
                        ByteBuffer wrap = ByteBuffer.wrap(new byte[intValue]);
                        wrap.put(sipMessage.getContent());
                        wrap.put(new byte[Math.max(0, (intValue - sipMessage.getContent().length) - bytes.length)]);
                        wrap.put(bytes);
                        sipMessage = new SipMessage(startLine, headerSection, wrap.array());
                    }
                }
            } else {
                advr.o("No conference event. No need to fix.", new Object[0]);
            }
        }
        adgs adgsVar = this.a.F;
        adgsVar.getClass();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(albo.cE((sipMessage.getStartLine() + sipMessage.getHeaderSection() + VCardBuilder.VCARD_END_OF_LINE).getBytes(StandardCharsets.UTF_8), sipMessage.getContent()));
            try {
                ainh a = aiof.a(byteArrayInputStream);
                byteArrayInputStream.close();
                adgsVar.g(a, false);
                asqc asqcVar = adgsVar.d;
                if (asqcVar != null) {
                    advr.d(adgs.a, ">>>>>>>>>> SIP message[%s] received (%d bytes) [Call-ID: %s]", ahmc.ab(a.l), Integer.valueOf(a.a().length()), a.h());
                    asqcVar.v(a);
                }
            } catch (Throwable th) {
                byteArrayInputStream.close();
                throw th;
            }
        } catch (ailb e) {
            advr.j(e, this.a.i, "Can't parse received message. %s", e.getMessage());
            this.a.C.q(adgsVar.d(), 7);
        } catch (Throwable th2) {
            advr.j(th2, this.a.i, "Can't process received message. %s", th2.getMessage());
            this.a.C.q(adgsVar.d(), 6);
        }
    }

    public final void onMessageSendFailure(String str, int i) {
        if (((Boolean) adgp.d.a()).booleanValue()) {
            adih adihVar = this.c;
            adgp adgpVar = this.a;
            String str2 = this.b;
            String A = adgpVar.A();
            aozy createBuilder = apha.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            apha aphaVar = (apha) apagVar;
            A.getClass();
            aphaVar.b |= 2;
            aphaVar.d = A;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            apha aphaVar2 = (apha) createBuilder.b;
            str2.getClass();
            aphaVar2.b |= 1;
            aphaVar2.c = str2;
            aozy createBuilder2 = aphb.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar2 = createBuilder2.b;
            aphb aphbVar = (aphb) apagVar2;
            str.getClass();
            aphbVar.b |= 1;
            aphbVar.c = str;
            if (!apagVar2.isMutable()) {
                createBuilder2.u();
            }
            aphb aphbVar2 = (aphb) createBuilder2.b;
            aphbVar2.b |= 2;
            aphbVar2.d = i;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apha aphaVar3 = (apha) createBuilder.b;
            aphb aphbVar3 = (aphb) createBuilder2.s();
            aphbVar3.getClass();
            aphaVar3.h = aphbVar3;
            aphaVar3.b |= 32;
            adihVar.g((apha) createBuilder.s());
        }
        adgs adgsVar = this.a.F;
        adgsVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            adgsVar.g((ainh) adgsVar.c.get(str), true);
            ainh ainhVar = (ainh) adgsVar.c.remove(str);
            if (ainhVar == null) {
                advr.h(adgs.a, "<<<<<<<<<< SIP message failed: reason code: %s", Integer.valueOf(i));
                return;
            }
            String u = ainhVar.u(2);
            advr.h(adgs.a, "<<<<<<<<<< SIP message[%s] failed [%s]: %s", ahmc.ab(ainhVar.l), u, a.bV(i, "reason code: "));
            asqc asqcVar = adgsVar.d;
            if (ainhVar.s() && u != null && asqcVar != null) {
                asqcVar.t(u);
            }
        }
    }

    public final void onMessageSent(String str) {
        adgs adgsVar = this.a.F;
        adgsVar.getClass();
        ainh ainhVar = (ainh) adgsVar.c.remove(str);
        adgsVar.g(ainhVar, false);
        asqc asqcVar = adgsVar.d;
        if (asqcVar != null && ainhVar != null) {
            asqcVar.u(ainhVar);
        }
    }
}
