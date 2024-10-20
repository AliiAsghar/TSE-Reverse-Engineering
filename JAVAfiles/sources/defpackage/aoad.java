package defpackage;

import android.app.PendingIntent;
import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.AutoValue_AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.AutoValue_RemoveUserFromGroupRequest;
import com.google.android.rcs.client.messaging.AutoValue_RevokeMessageRequest;
import com.google.android.rcs.client.messaging.AutoValue_UpdateGroupRequest;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.android.rcs.client.messaging.RevokeMessageRequest;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.android.rcs.client.messaging.data.AutoValue_ContentType;
import com.google.android.rcs.client.messaging.data.AutoValue_MessageNotification;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageNotification;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import com.google.android.rcs.client.messaging.data.TraceId;
import j$.time.Instant;
import j$.util.Optional;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoad {
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public aoad() {
        this.c = null;
        this.d = null;
        this.a = null;
        this.b = null;
    }

    public final void A(alor alorVar) {
        aluq listIterator = alorVar.keySet().listIterator();
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            String str2 = (String) alorVar.get(str);
            if (str2 != null) {
                z().h(albo.ap(str), str2);
            }
        }
    }

    public final void B(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null subType");
    }

    public final void C(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public final UpdateGroupRequest D() {
        Object obj;
        Object obj2 = this.d;
        if (obj2 != null && (obj = this.b) != null) {
            return new AutoValue_UpdateGroupRequest((PendingIntent) obj2, (Conversation) obj, (Optional) this.c, (Optional) this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" intent");
        }
        if (this.b == null) {
            sb.append(" conversation");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void E(Conversation conversation) {
        if (conversation != null) {
            this.b = conversation;
            return;
        }
        throw new NullPointerException("Null conversation");
    }

    public final void F(PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            this.d = pendingIntent;
            return;
        }
        throw new NullPointerException("Null intent");
    }

    public final void G(aozb aozbVar) {
        this.a = Optional.of(aozbVar);
    }

    public final void H(String str) {
        this.c = Optional.of(str);
    }

    public final void I(TraceId traceId) {
        if (traceId != null) {
            this.a = traceId;
            return;
        }
        throw new NullPointerException("Null traceId");
    }

    public final RevokeMessageRequest J() {
        Object obj;
        Object obj2;
        Object obj3 = this.d;
        if (obj3 != null && (obj = this.b) != null && (obj2 = this.a) != null) {
            return new AutoValue_RevokeMessageRequest((PendingIntent) obj3, (Conversation) obj, (String) obj2, (Optional) this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" intent");
        }
        if (this.b == null) {
            sb.append(" conversation");
        }
        if (this.a == null) {
            sb.append(" messageId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void K(Conversation conversation) {
        if (conversation != null) {
            this.b = conversation;
            return;
        }
        throw new NullPointerException("Null conversation");
    }

    public final void L(PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            this.d = pendingIntent;
            return;
        }
        throw new NullPointerException("Null intent");
    }

    public final void M(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null messageId");
    }

    public final void N(aozb aozbVar) {
        this.c = Optional.of(aozbVar);
    }

    public final RemoveUserFromGroupRequest O() {
        Object obj;
        Object obj2;
        Object obj3 = this.d;
        if (obj3 != null && (obj = this.b) != null && (obj2 = this.c) != null) {
            return new AutoValue_RemoveUserFromGroupRequest((PendingIntent) obj3, (Conversation) obj, (RcsDestinationId) obj2, (Optional) this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" intent");
        }
        if (this.b == null) {
            sb.append(" conversation");
        }
        if (this.c == null) {
            sb.append(" user");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void P(Conversation conversation) {
        if (conversation != null) {
            this.b = conversation;
            return;
        }
        throw new NullPointerException("Null conversation");
    }

    public final void Q(PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            this.d = pendingIntent;
            return;
        }
        throw new NullPointerException("Null intent");
    }

    public final void R(aozb aozbVar) {
        this.a = Optional.of(aozbVar);
    }

    public final void S(RcsDestinationId rcsDestinationId) {
        if (rcsDestinationId != null) {
            this.c = rcsDestinationId;
            return;
        }
        throw new NullPointerException("Null user");
    }

    public final ajpq T() {
        Object obj = this.c;
        if (obj != null) {
            return (ajpq) obj;
        }
        throw new IllegalStateException("Property \"type\" has not been set");
    }

    public final Optional U() {
        Object obj = this.b;
        if (obj == null) {
            return Optional.empty();
        }
        return Optional.of(obj);
    }

    public final void V(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final void W(ajpq ajpqVar) {
        if (ajpqVar != null) {
            this.c = ajpqVar;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public final AddUserToGroupRequest X() {
        Object obj;
        Object obj2;
        Object obj3 = this.c;
        if (obj3 != null && (obj = this.a) != null && (obj2 = this.d) != null) {
            return new AutoValue_AddUserToGroupRequest((PendingIntent) obj3, (Conversation) obj, (RcsDestinationId) obj2, (Optional) this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" intent");
        }
        if (this.a == null) {
            sb.append(" conversation");
        }
        if (this.d == null) {
            sb.append(" user");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void Y(Conversation conversation) {
        if (conversation != null) {
            this.a = conversation;
            return;
        }
        throw new NullPointerException("Null conversation");
    }

    public final void Z(PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            this.c = pendingIntent;
            return;
        }
        throw new NullPointerException("Null intent");
    }

    public final aoaf a() {
        if (this.c != null) {
            Object obj = this.d;
            if (obj != null) {
                if (this.a != null) {
                    if (this.b != null) {
                        if (((Integer) obj).intValue() != 16 && ((Integer) this.d).intValue() != 32) {
                            Object obj2 = this.d;
                            Objects.toString(obj2);
                            throw new GeneralSecurityException("derivedAesGcmKeySizeBytes needs to be 16 or 32, not ".concat(String.valueOf(obj2)));
                        }
                        if (((Integer) this.c).intValue() >= ((Integer) this.d).intValue()) {
                            if (((Integer) this.b).intValue() > ((Integer) this.d).intValue() + 24) {
                                return new aoaf((Integer) this.c, (Integer) this.d, (aoae) this.a, (Integer) this.b);
                            }
                            throw new GeneralSecurityException("ciphertextSegmentSizeBytes needs to be at least derivedAesGcmKeySizeBytes + 25, i.e., " + (((Integer) this.d).intValue() + 25));
                        }
                        Object obj3 = this.d;
                        Objects.toString(obj3);
                        throw new GeneralSecurityException("keySizeBytes needs to be at least derivedAesGcmKeySizeBytes, i.e., ".concat(String.valueOf(obj3)));
                    }
                    throw new GeneralSecurityException("ciphertextSegmentSizeBytes needs to be set");
                }
                throw new GeneralSecurityException("hkdfHashType needs to be set");
            }
            throw new GeneralSecurityException("derivedAesGcmKeySizeBytes needs to be set");
        }
        throw new GeneralSecurityException("keySizeBytes needs to be set");
    }

    public final void aa(aozb aozbVar) {
        this.b = Optional.of(aozbVar);
    }

    public final void ab(RcsDestinationId rcsDestinationId) {
        if (rcsDestinationId != null) {
            this.d = rcsDestinationId;
            return;
        }
        throw new NullPointerException("Null user");
    }

    public final void b(int i) {
        this.b = Integer.valueOf(i);
    }

    public final void c(int i) {
        this.d = Integer.valueOf(i);
    }

    public final void d(int i) {
        this.c = Integer.valueOf(i);
    }

    public final anuv e() {
        Object obj = this.d;
        if (obj != null) {
            if (this.c != null) {
                if (this.a != null) {
                    if (this.b != null) {
                        if (((Integer) obj).intValue() >= 16) {
                            Integer num = (Integer) this.c;
                            int intValue = num.intValue();
                            Object obj2 = this.a;
                            if (intValue >= 10) {
                                if (obj2 == anut.a) {
                                    if (intValue > 20) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
                                    }
                                } else if (obj2 == anut.b) {
                                    if (intValue > 28) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
                                    }
                                } else if (obj2 == anut.c) {
                                    if (intValue > 32) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
                                    }
                                } else if (obj2 == anut.d) {
                                    if (intValue > 48) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
                                    }
                                } else if (obj2 == anut.e) {
                                    if (intValue > 64) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
                                    }
                                } else {
                                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                                }
                                return new anuv(((Integer) this.d).intValue(), ((Integer) this.c).intValue(), (anuu) this.b, (anut) this.a);
                            }
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num));
                        }
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.d));
                    }
                    throw new GeneralSecurityException("variant is not set");
                }
                throw new GeneralSecurityException("hash type is not set");
            }
            throw new GeneralSecurityException("tag size is not set");
        }
        throw new GeneralSecurityException("key size is not set");
    }

    public final void f(int i) {
        this.d = Integer.valueOf(i);
    }

    public final void g(int i) {
        this.c = Integer.valueOf(i);
    }

    public final anoe h() {
        Object obj = this.c;
        if (obj != null) {
            if (this.a != null) {
                if (this.d != null) {
                    if (this.b != null) {
                        int intValue = ((Integer) obj).intValue();
                        ((Integer) this.d).intValue();
                        ((Integer) this.b).intValue();
                        return new anoe(intValue, (anod) this.a);
                    }
                    throw new GeneralSecurityException("Tag size is not set");
                }
                throw new GeneralSecurityException("IV size is not set");
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    public final void i() {
        this.d = 12;
    }

    public final void j(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.c = Integer.valueOf(i);
    }

    public final void k() {
        this.b = 16;
    }

    public final annz l() {
        Object obj = this.c;
        if (obj != null) {
            if (this.d != null) {
                if (this.a != null) {
                    if (this.b != null) {
                        int intValue = ((Integer) obj).intValue();
                        int intValue2 = ((Integer) this.d).intValue();
                        ((Integer) this.b).intValue();
                        return new annz(intValue, intValue2, (anny) this.a);
                    }
                    throw new GeneralSecurityException("Tag size is not set");
                }
                throw new GeneralSecurityException("Variant is not set");
            }
            throw new GeneralSecurityException("IV size is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    public final void m(int i) {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.d = Integer.valueOf(i);
    }

    public final void n(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.c = Integer.valueOf(i);
    }

    public final void o() {
        this.b = 16;
    }

    public final anip p() {
        Object obj;
        Object obj2 = this.a;
        if (obj2 != null) {
            s(albo.au((String) obj2));
            Object obj3 = this.b;
            if (obj3 != null) {
                r(albo.au((String) obj3));
                Object obj4 = this.c;
                if (obj4 != null) {
                    this.d = ((alok) obj4).b();
                } else if (this.d == null) {
                    this.d = altc.a;
                }
                Object obj5 = this.a;
                if (obj5 != null && (obj = this.b) != null) {
                    return new anip((String) obj5, (String) obj, (alor) this.d);
                }
                StringBuilder sb = new StringBuilder();
                if (this.a == null) {
                    sb.append(" type");
                }
                if (this.b == null) {
                    sb.append(" subType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            throw new IllegalStateException("Property \"subType\" has not been set");
        }
        throw new IllegalStateException("Property \"type\" has not been set");
    }

    public final void q(Map map) {
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            if (this.c == null) {
                this.c = new alok();
            }
            ((alok) this.c).h(albo.au(str), str2);
        }
    }

    public final void r(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null subType");
    }

    public final void s(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public final MessageNotification t() {
        Object obj;
        Object obj2;
        Object obj3 = this.b;
        if (obj3 != null && (obj = this.a) != null && (obj2 = this.c) != null) {
            return new AutoValue_MessageNotification((Conversation) obj3, (Message) obj, (TraceId) obj2, (Optional) this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" conversation");
        }
        if (this.a == null) {
            sb.append(" message");
        }
        if (this.c == null) {
            sb.append(" traceId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void u(Conversation conversation) {
        if (conversation != null) {
            this.b = conversation;
            return;
        }
        throw new NullPointerException("Null conversation");
    }

    public final void v(Instant instant) {
        this.d = Optional.of(instant);
    }

    public final void w(Message message) {
        if (message != null) {
            this.a = message;
            return;
        }
        throw new NullPointerException("Null message");
    }

    public final void x(TraceId traceId) {
        if (traceId != null) {
            this.c = traceId;
            return;
        }
        throw new NullPointerException("Null traceId");
    }

    public final ContentType y() {
        Object obj = this.d;
        if (obj != null) {
            C(albo.ap((String) obj));
            Object obj2 = this.c;
            if (obj2 != null) {
                B(albo.ap((String) obj2));
                Object obj3 = this.b;
                if (obj3 != null) {
                    this.a = ((alok) obj3).b();
                } else if (this.a == null) {
                    this.a = altc.a;
                }
                if (this.d != null && this.c != null) {
                    Object obj4 = this.d;
                    return new AutoValue_ContentType((String) obj4, (String) this.c, (alor) this.a);
                }
                StringBuilder sb = new StringBuilder();
                if (this.d == null) {
                    sb.append(" type");
                }
                if (this.c == null) {
                    sb.append(" subType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            throw new IllegalStateException("Property \"subType\" has not been set");
        }
        throw new IllegalStateException("Property \"type\" has not been set");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final alok z() {
        if (this.b == null) {
            if (this.a == null) {
                this.b = new alok();
            } else {
                alok alokVar = new alok();
                this.b = alokVar;
                alokVar.l(this.a);
                this.a = null;
            }
        }
        return (alok) this.b;
    }

    public aoad(ContentType contentType) {
        AutoValue_ContentType autoValue_ContentType = (AutoValue_ContentType) contentType;
        this.d = autoValue_ContentType.a;
        this.c = autoValue_ContentType.b;
        this.a = autoValue_ContentType.c;
    }

    public aoad(byte[] bArr) {
        this.d = null;
        this.c = null;
        this.a = null;
        this.b = anuu.d;
    }

    public aoad(byte[] bArr, byte[] bArr2) {
        this.c = null;
        this.d = null;
        this.b = null;
        this.a = anny.c;
    }

    public aoad(char[] cArr) {
        this.c = null;
        this.d = null;
        this.b = null;
        this.a = anod.c;
    }

    public aoad(char[] cArr, byte[] bArr) {
    }

    public aoad(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.b = Optional.empty();
    }

    public aoad(byte[] bArr, char[] cArr) {
        this.d = Optional.empty();
    }

    public aoad(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = Optional.empty();
        this.c = Optional.empty();
        this.b = Optional.empty();
        this.d = Optional.empty();
    }

    public aoad(byte[] bArr, byte[] bArr2, byte[] bArr3, char[] cArr) {
        this.a = Optional.empty();
    }

    public aoad(byte[] bArr, char[] cArr, byte[] bArr2) {
        this.c = Optional.empty();
    }

    public aoad(byte[] bArr, byte[] bArr2, char[] cArr) {
        this.c = Optional.empty();
        this.a = Optional.empty();
    }
}
