package defpackage;

import android.app.PendingIntent;
import com.google.android.rcs.client.messaging.AutoValue_SendMessageRequest;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.data.AutoValue_GroupInformation;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.GroupInformation;
import com.google.android.rcs.client.messaging.data.GroupRemoteCapabilities;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.android.rcs.client.messaging.data.SubjectExtension;
import com.google.android.rcs.client.messaging.data.TraceId;
import j$.util.Optional;
import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anzh {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public anzh() {
        this.g = null;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, apbt] */
    public final ahcj A() {
        ?? r3;
        Object obj;
        Object obj2 = this.b;
        if (obj2 != null && (r3 = this.d) != 0 && (obj = this.g) != null) {
            Object obj3 = this.a;
            Object obj4 = this.e;
            return new ahcj((String) obj2, r3, (amnr) obj3, (Integer) obj4, (apwa) obj, (int[]) this.c, (int[]) this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" logSource");
        }
        if (this.d == null) {
            sb.append(" message");
        }
        if (this.g == null) {
            sb.append(" qosTier");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void B(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null logSource");
    }

    public final void C(apbt apbtVar) {
        if (apbtVar != null) {
            this.d = apbtVar;
            return;
        }
        throw new NullPointerException("Null message");
    }

    public final void D(apwa apwaVar) {
        if (apwaVar != null) {
            this.g = apwaVar;
            return;
        }
        throw new NullPointerException("Null qosTier");
    }

    public final void E(ahmn ahmnVar, ahmn ahmnVar2) {
        this.d = ahmnVar;
        this.e = ahmnVar2;
    }

    public final void F(ahmn ahmnVar, ahmn ahmnVar2) {
        this.b = ahmnVar;
        this.c = ahmnVar2;
    }

    public final void G(ahmn ahmnVar, ahmn ahmnVar2) {
        this.d = ahmnVar;
        this.e = ahmnVar2;
    }

    public final void H(ahmn ahmnVar, ahmn ahmnVar2) {
        this.b = ahmnVar;
        this.c = ahmnVar2;
    }

    public final anzi a() {
        Object obj;
        Object obj2;
        Object obj3 = this.g;
        if (obj3 != null) {
            Object obj4 = this.b;
            if (obj4 != null && (obj = this.c) != null) {
                Object obj5 = this.a;
                if (obj5 != null) {
                    Object obj6 = this.d;
                    if (obj6 != null && (obj2 = this.e) != null) {
                        Object obj7 = this.f;
                        if (obj7 != null) {
                            anzj anzjVar = (anzj) obj3;
                            anzg anzgVar = anzjVar.e;
                            BigInteger bigInteger = anzjVar.f;
                            Object obj8 = ((ahmn) obj5).a;
                            BigInteger bigInteger2 = (BigInteger) ((ahmn) obj4).a;
                            if (bigInteger2.isProbablePrime(10)) {
                                BigInteger bigInteger3 = (BigInteger) ((ahmn) obj).a;
                                if (bigInteger3.isProbablePrime(10)) {
                                    if (bigInteger2.multiply(bigInteger3).equals(bigInteger)) {
                                        BigInteger bigInteger4 = anzgVar.g;
                                        BigInteger subtract = bigInteger2.subtract(BigInteger.ONE);
                                        BigInteger subtract2 = bigInteger3.subtract(BigInteger.ONE);
                                        if (bigInteger4.multiply((BigInteger) obj8).mod(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2)).equals(BigInteger.ONE)) {
                                            if (bigInteger4.multiply((BigInteger) ((ahmn) obj6).a).mod(subtract).equals(BigInteger.ONE)) {
                                                if (bigInteger4.multiply((BigInteger) ((ahmn) obj2).a).mod(subtract2).equals(BigInteger.ONE)) {
                                                    if (bigInteger3.multiply((BigInteger) ((ahmn) obj7).a).mod(bigInteger2).equals(BigInteger.ONE)) {
                                                        Object obj9 = this.g;
                                                        Object obj10 = this.b;
                                                        Object obj11 = this.c;
                                                        Object obj12 = this.a;
                                                        Object obj13 = this.d;
                                                        ahmn ahmnVar = (ahmn) obj13;
                                                        ahmn ahmnVar2 = (ahmn) obj12;
                                                        return new anzi((anzj) obj9, (ahmn) obj10, (ahmn) obj11, ahmnVar2, ahmnVar, (ahmn) this.e, (ahmn) this.f);
                                                    }
                                                    throw new GeneralSecurityException("qInv is invalid.");
                                                }
                                                throw new GeneralSecurityException("dQ is invalid.");
                                            }
                                            throw new GeneralSecurityException("dP is invalid.");
                                        }
                                        throw new GeneralSecurityException("D is invalid.");
                                    }
                                    throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
                                }
                                throw new GeneralSecurityException("q is not a prime");
                            }
                            throw new GeneralSecurityException("p is not a prime");
                        }
                        throw new GeneralSecurityException("Cannot build without CRT coefficient");
                    }
                    throw new GeneralSecurityException("Cannot build without prime exponents");
                }
                throw new GeneralSecurityException("Cannot build without private exponent");
            }
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
    }

    public final anza b() {
        Object obj;
        Object obj2;
        Object obj3 = this.g;
        if (obj3 != null) {
            Object obj4 = this.b;
            if (obj4 != null && (obj = this.c) != null) {
                Object obj5 = this.a;
                if (obj5 != null) {
                    Object obj6 = this.d;
                    if (obj6 != null && (obj2 = this.e) != null) {
                        Object obj7 = this.f;
                        if (obj7 != null) {
                            anzb anzbVar = (anzb) obj3;
                            anyz anyzVar = anzbVar.e;
                            BigInteger bigInteger = anzbVar.f;
                            Object obj8 = ((ahmn) obj5).a;
                            BigInteger bigInteger2 = (BigInteger) ((ahmn) obj4).a;
                            if (bigInteger2.isProbablePrime(10)) {
                                BigInteger bigInteger3 = (BigInteger) ((ahmn) obj).a;
                                if (bigInteger3.isProbablePrime(10)) {
                                    if (bigInteger2.multiply(bigInteger3).equals(bigInteger)) {
                                        BigInteger bigInteger4 = anyzVar.g;
                                        BigInteger subtract = bigInteger2.subtract(BigInteger.ONE);
                                        BigInteger subtract2 = bigInteger3.subtract(BigInteger.ONE);
                                        if (bigInteger4.multiply((BigInteger) obj8).mod(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2)).equals(BigInteger.ONE)) {
                                            if (bigInteger4.multiply((BigInteger) ((ahmn) obj6).a).mod(subtract).equals(BigInteger.ONE)) {
                                                if (bigInteger4.multiply((BigInteger) ((ahmn) obj2).a).mod(subtract2).equals(BigInteger.ONE)) {
                                                    if (bigInteger3.multiply((BigInteger) ((ahmn) obj7).a).mod(bigInteger2).equals(BigInteger.ONE)) {
                                                        Object obj9 = this.g;
                                                        Object obj10 = this.b;
                                                        Object obj11 = this.c;
                                                        Object obj12 = this.a;
                                                        Object obj13 = this.d;
                                                        ahmn ahmnVar = (ahmn) obj13;
                                                        ahmn ahmnVar2 = (ahmn) obj12;
                                                        return new anza((anzb) obj9, (ahmn) obj10, (ahmn) obj11, ahmnVar2, ahmnVar, (ahmn) this.e, (ahmn) this.f);
                                                    }
                                                    throw new GeneralSecurityException("qInv is invalid.");
                                                }
                                                throw new GeneralSecurityException("dQ is invalid.");
                                            }
                                            throw new GeneralSecurityException("dP is invalid.");
                                        }
                                        throw new GeneralSecurityException("D is invalid.");
                                    }
                                    throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
                                }
                                throw new GeneralSecurityException("q is not a prime");
                            }
                            throw new GeneralSecurityException("p is not a prime");
                        }
                        throw new GeneralSecurityException("Cannot build without CRT coefficient");
                    }
                    throw new GeneralSecurityException("Cannot build without prime exponents");
                }
                throw new GeneralSecurityException("Cannot build without private exponent");
            }
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
    }

    public final GroupInformation c() {
        Object obj;
        Object obj2;
        Object obj3 = this.g;
        if (obj3 != null) {
            this.a = ((alob) obj3).g();
        } else if (this.a == null) {
            int i = alog.d;
            this.a = alsx.a;
        }
        Object obj4 = this.c;
        if (obj4 != null && (obj = this.f) != null && (obj2 = this.b) != null) {
            Object obj5 = this.a;
            return new AutoValue_GroupInformation((String) obj4, (String) obj, (String) obj2, (alog) obj5, (Optional) this.d, (Optional) this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" id");
        }
        if (this.f == null) {
            sb.append(" subject");
        }
        if (this.b == null) {
            sb.append(" conferenceUri");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void d(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null conferenceUri");
    }

    public final void e(GroupRemoteCapabilities groupRemoteCapabilities) {
        this.d = Optional.of(groupRemoteCapabilities);
    }

    public final void f(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    public final void g(String str) {
        if (str != null) {
            this.f = str;
            return;
        }
        throw new NullPointerException("Null subject");
    }

    public final void h(SubjectExtension subjectExtension) {
        this.e = Optional.of(subjectExtension);
    }

    public final SendMessageRequest i() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6 = this.a;
        if (obj6 != null && (obj = this.g) != null && (obj2 = this.d) != null && (obj3 = this.e) != null && (obj4 = this.f) != null && (obj5 = this.b) != null) {
            return new AutoValue_SendMessageRequest((PendingIntent) obj6, (Conversation) obj, (Message) obj2, (MessageClass) obj3, (TraceId) obj4, (Optional) this.c, (ajqw) obj5);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" intent");
        }
        if (this.g == null) {
            sb.append(" conversation");
        }
        if (this.d == null) {
            sb.append(" message");
        }
        if (this.e == null) {
            sb.append(" messageClass");
        }
        if (this.f == null) {
            sb.append(" traceId");
        }
        if (this.b == null) {
            sb.append(" messagingMethod");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void j(Conversation conversation) {
        if (conversation != null) {
            this.g = conversation;
            return;
        }
        throw new NullPointerException("Null conversation");
    }

    public final void k(PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            this.a = pendingIntent;
            return;
        }
        throw new NullPointerException("Null intent");
    }

    public final void l(Message message) {
        if (message != null) {
            this.d = message;
            return;
        }
        throw new NullPointerException("Null message");
    }

    public final void m(MessageClass messageClass) {
        if (messageClass != null) {
            this.e = messageClass;
            return;
        }
        throw new NullPointerException("Null messageClass");
    }

    public final void n(ajqw ajqwVar) {
        if (ajqwVar != null) {
            this.b = ajqwVar;
            return;
        }
        throw new NullPointerException("Null messagingMethod");
    }

    public final void o(aozb aozbVar) {
        this.c = Optional.of(aozbVar);
    }

    public final void p(TraceId traceId) {
        if (traceId != null) {
            this.f = traceId;
            return;
        }
        throw new NullPointerException("Null traceId");
    }

    public final com.google.android.rcs.client.messaging.GroupInformation q() {
        Object obj;
        Object obj2;
        Object obj3 = this.a;
        if (obj3 != null) {
            this.g = ((alob) obj3).g();
        } else if (this.g == null) {
            int i = alog.d;
            this.g = alsx.a;
        }
        Object obj4 = this.f;
        if (obj4 != null && (obj = this.c) != null && (obj2 = this.b) != null) {
            Object obj5 = this.g;
            return new com.google.android.rcs.client.messaging.AutoValue_GroupInformation((String) obj4, (String) obj, (String) obj2, (alog) obj5, (Optional) this.d, (Optional) this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" id");
        }
        if (this.c == null) {
            sb.append(" subject");
        }
        if (this.b == null) {
            sb.append(" conferenceUri");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void r(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null conferenceUri");
    }

    public final void s(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null subject");
    }

    public final void t(aiav aiavVar) {
        if (aiavVar != null) {
            this.a = aiavVar;
            return;
        }
        throw new NullPointerException("Null freeGarageParking");
    }

    public final void u(aiav aiavVar) {
        if (aiavVar != null) {
            this.d = aiavVar;
            return;
        }
        throw new NullPointerException("Null freeParkingLot");
    }

    public final void v(aiav aiavVar) {
        if (aiavVar != null) {
            this.g = aiavVar;
            return;
        }
        throw new NullPointerException("Null freeStreetParking");
    }

    public final void w(aiav aiavVar) {
        if (aiavVar != null) {
            this.e = aiavVar;
            return;
        }
        throw new NullPointerException("Null paidGarageParking");
    }

    public final void x(aiav aiavVar) {
        if (aiavVar != null) {
            this.b = aiavVar;
            return;
        }
        throw new NullPointerException("Null paidParkingLot");
    }

    public final void y(aiav aiavVar) {
        if (aiavVar != null) {
            this.c = aiavVar;
            return;
        }
        throw new NullPointerException("Null paidStreetParking");
    }

    public final void z(aiav aiavVar) {
        if (aiavVar != null) {
            this.f = aiavVar;
            return;
        }
        throw new NullPointerException("Null valetParking");
    }

    public anzh(short[] sArr, byte[] bArr) {
    }

    public anzh(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = Optional.empty();
        this.e = Optional.empty();
    }

    public anzh(byte[] bArr, char[] cArr) {
        this.c = Optional.empty();
    }

    public anzh(byte[] bArr, byte[] bArr2) {
        this.d = Optional.empty();
        this.e = Optional.empty();
    }
}
