package defpackage;

import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiho extends BrowserCompatHostnameVerifier implements HandshakeCompletedListener {
    private static final advp a = new advp("SipProxyHostVerifier");
    private final String b;
    private final aihn c;

    public aiho(String str, aihn aihnVar) {
        this.b = str;
        this.c = aihnVar;
    }

    private static X509Certificate a(HandshakeCompletedEvent handshakeCompletedEvent) {
        try {
            Certificate[] peerCertificates = handshakeCompletedEvent.getPeerCertificates();
            if (peerCertificates != null && peerCertificates.length != 0) {
                Certificate certificate = peerCertificates[0];
                if (certificate instanceof X509Certificate) {
                    return (X509Certificate) certificate;
                }
            }
        } catch (SSLPeerUnverifiedException unused) {
        }
        return null;
    }

    @Override // javax.net.ssl.HandshakeCompletedListener
    public final void handshakeCompleted(HandshakeCompletedEvent handshakeCompletedEvent) {
        Principal subjectDN;
        advp advpVar = a;
        advr.d(advpVar, "TLS handshake completed: %s", handshakeCompletedEvent);
        X509Certificate a2 = a(handshakeCompletedEvent);
        String str = null;
        if (a2 != null && (subjectDN = a2.getSubjectDN()) != null) {
            str = subjectDN.getName();
        }
        advr.d(advpVar, "Verifying SIP proxy host %s against certificate for %s.", this.b, str);
        if (verify(this.b, handshakeCompletedEvent.getSession())) {
            advr.c("SIP host verification succeeded for host %s", this.b);
            return;
        }
        aihn aihnVar = this.c;
        advr.q("SIP host verification failed for host %s! Terminating transport!", this.b);
        aipa aipaVar = (aipa) aihnVar;
        aipaVar.q(apje.SOCKET_FAILURE_HOST_VERIFICATION_FAILED);
        if (((Boolean) aipa.a.a()).booleanValue()) {
            aipaVar.k();
        } else {
            advr.q("Not terminating SIP transport even though host verification failed.", new Object[0]);
        }
    }
}
