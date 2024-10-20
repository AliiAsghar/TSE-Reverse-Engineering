package defpackage;

import android.app.PendingIntent;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadRequest;
import com.google.android.rcs.client.messaging.AutoValue_TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.data.AutoValue_FileTransferInformation;
import com.google.android.rcs.client.messaging.data.AutoValue_GroupNotification;
import com.google.android.rcs.client.messaging.data.AutoValue_IsComposingMessage;
import com.google.android.rcs.client.messaging.data.AutoValue_MessageExtensionHeader;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import com.google.android.rcs.client.messaging.data.GroupEvent;
import com.google.android.rcs.client.messaging.data.GroupInformation;
import com.google.android.rcs.client.messaging.data.GroupNotification;
import com.google.android.rcs.client.messaging.data.IsComposingMessage;
import com.google.android.rcs.client.messaging.data.MessageExtensionHeader;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arbj {
    public Object a;
    public Object b;
    public Object c;

    public arbj() {
    }

    public static String h(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.concurrent.ThreadFactory] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    public static ThreadFactory t(arbj arbjVar) {
        AtomicLong atomicLong;
        Object obj = arbjVar.a;
        Object obj2 = arbjVar.c;
        Object obj3 = arbjVar.b;
        ?? r5 = obj3;
        if (obj3 == null) {
            r5 = Executors.defaultThreadFactory();
        }
        if (obj != null) {
            atomicLong = new AtomicLong(0L);
        } else {
            atomicLong = null;
        }
        return new anex(r5, (String) obj, atomicLong, (Boolean) obj2);
    }

    public final void A(GroupEvent groupEvent) {
        this.b = Optional.of(groupEvent);
    }

    public final void B(GroupInformation groupInformation) {
        this.a = Optional.of(groupInformation);
    }

    public final FileTransferInformation C() {
        Object obj = this.a;
        if (obj != null) {
            return new AutoValue_FileTransferInformation((FileInformation) obj, (Optional) this.c, (Optional) this.b);
        }
        throw new IllegalStateException("Missing required properties: fileInformation");
    }

    public final void D(aozb aozbVar) {
        this.b = Optional.of(aozbVar);
    }

    public final void E(FileInformation fileInformation) {
        if (fileInformation != null) {
            this.a = fileInformation;
            return;
        }
        throw new NullPointerException("Null fileInformation");
    }

    public final void F(FileInformation fileInformation) {
        this.c = Optional.of(fileInformation);
    }

    public final ajqb G() {
        Object obj;
        Object obj2;
        Object obj3 = this.b;
        if (obj3 != null && (obj = this.a) != null && (obj2 = this.c) != null) {
            return new ajqb((String) obj3, (String) obj, (String) obj2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" namespace");
        }
        if (this.a == null) {
            sb.append(" name");
        }
        if (this.c == null) {
            sb.append(" value");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void H(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    public final void I(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null namespace");
    }

    public final void J(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null value");
    }

    public final TriggerGroupNotificationRequest K() {
        Object obj;
        Object obj2 = this.c;
        if (obj2 != null && (obj = this.b) != null) {
            return new AutoValue_TriggerGroupNotificationRequest((PendingIntent) obj2, (Conversation) obj, (Optional) this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" intent");
        }
        if (this.b == null) {
            sb.append(" conversation");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void L(Conversation conversation) {
        if (conversation != null) {
            this.b = conversation;
            return;
        }
        throw new NullPointerException("Null conversation");
    }

    public final void M(PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            this.c = pendingIntent;
            return;
        }
        throw new NullPointerException("Null intent");
    }

    public final void N(aozb aozbVar) {
        this.a = Optional.of(aozbVar);
    }

    public final void O(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null subType");
    }

    public final void P(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public final aiyz Q() {
        Object obj;
        Object obj2;
        Object obj3 = this.a;
        if (obj3 != null && (obj = this.c) != null && (obj2 = this.b) != null) {
            return new aiyz((String) obj3, (String) obj, (aizd) obj2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" sessionId");
        }
        if (this.c == null) {
            sb.append(" triggerId");
        }
        if (this.b == null) {
            sb.append(" surveyStyle");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void R(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final void S(aizd aizdVar) {
        if (aizdVar != null) {
            this.b = aizdVar;
            return;
        }
        throw new NullPointerException("Null surveyStyle");
    }

    public final void T(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null triggerId");
    }

    public final void U(List list) {
        if (list != null) {
            this.c = list;
            return;
        }
        throw new NullPointerException("Null countries");
    }

    public final void V(List list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null typesFilter");
    }

    public final aibl W() {
        Y(alog.n(X().b));
        return X();
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List, java.lang.Object] */
    public final aibl X() {
        ?? r1;
        Object obj = this.c;
        if (obj != null && (r1 = this.a) != 0) {
            return new aibl((String) obj, r1, (adae) this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" placeId");
        }
        if (this.a == null) {
            sb.append(" placeFields");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void Y(List list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null placeFields");
    }

    public final ahyu Z() {
        ahyu aa = aa();
        d.t(!aa.a.isEmpty(), "Name must not be empty.");
        List list = aa.c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d.t(!TextUtils.isEmpty((String) it.next()), "Types must not contain null or empty values.");
        }
        ab(alog.n(list));
        return aa();
    }

    public final aqvb a() {
        Object obj = this.c;
        return new aqvb((aqwa) obj, (aqrm) this.a, (aquz) this.b);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List, java.lang.Object] */
    public final ahyu aa() {
        ?? r1;
        Object obj = this.b;
        if (obj != null && (r1 = this.a) != 0) {
            return new ahyz((String) obj, (String) this.c, r1);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" name");
        }
        if (this.a == null) {
            sb.append(" types");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void ab(List list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null types");
    }

    public final ResumeDownloadRequest ac() {
        Object obj;
        Object obj2;
        Object obj3 = this.b;
        if (obj3 != null && (obj = this.a) != null && (obj2 = this.c) != null) {
            return new adsq((PendingIntent) obj3, (String) obj, (FileInformation) obj2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" intent");
        }
        if (this.a == null) {
            sb.append(" downloadId");
        }
        if (this.c == null) {
            sb.append(" fileInformation");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void ad(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null downloadId");
    }

    public final void ae(FileInformation fileInformation) {
        if (fileInformation != null) {
            this.c = fileInformation;
            return;
        }
        throw new NullPointerException("Null fileInformation");
    }

    public final void af(PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            this.b = pendingIntent;
            return;
        }
        throw new NullPointerException("Null intent");
    }

    public final void ag(ParticipantColor participantColor) {
        this.b = Optional.ofNullable(participantColor);
    }

    public final ypl ah() {
        Object obj;
        Object obj2;
        Object obj3 = this.b;
        if (obj3 != null && (obj = this.c) != null && (obj2 = this.a) != null) {
            return new ypl((ypk) obj3, (String) obj, (String) obj2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" messageSuspiciousnessScore");
        }
        if (this.c == null) {
            sb.append(" countryCode");
        }
        if (this.a == null) {
            sb.append(" locale");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void ai(ypk ypkVar) {
        if (ypkVar != null) {
            this.b = ypkVar;
            return;
        }
        throw new NullPointerException("Null messageSuspiciousnessScore");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final boolean b(aoyb aoybVar) {
        ?? r0 = this.b;
        ?? r1 = this.c;
        if (r1.containsKey(aoybVar)) {
            if (((atkn) r1.get(aoybVar)).b == null) {
                return false;
            }
            return true;
        }
        return r0.containsKey(aoybVar);
    }

    public final void c(String str, EnumMap enumMap) {
        this.a = str;
        this.b = enumMap;
        this.c = new EnumMap(aoyb.class);
    }

    public final anuo d() {
        Object obj = this.b;
        if (obj != null) {
            if (this.c != null) {
                if (this.a != null) {
                    return new anuo(((Integer) obj).intValue(), ((Integer) this.c).intValue(), (anun) this.a);
                }
                throw new GeneralSecurityException("variant not set");
            }
            throw new GeneralSecurityException("tag size not set");
        }
        throw new GeneralSecurityException("key size not set");
    }

    public final void e(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.b = Integer.valueOf(i);
    }

    public final void f(int i) {
        if (i >= 10 && i <= 16) {
            this.c = Integer.valueOf(i);
            return;
        }
        throw new GeneralSecurityException(a.bV(i, "Invalid tag size for AesCmacParameters: "));
    }

    public final void g(anjc anjcVar) {
        if (anjcVar != null) {
            this.a = anjcVar;
            return;
        }
        throw new NullPointerException("Null groupIconModificationPolicy");
    }

    public final void i() {
        this.c = true;
    }

    public final void j(String str) {
        h(str, 0);
        this.a = str;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [armf, java.lang.Object] */
    public final akob k() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.c != null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "Every SyncletBinding must have a non-null SyncKey.");
        if (this.b != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        albo.U(z2, "Every SyncletBinding must have a non-null SyncConfig.");
        if (this.a != null) {
            z3 = true;
        }
        albo.U(z3, "Every SyncletBinding must have a non-null Synclet.");
        return new akob(true, (aknz) this.c, (aknv) this.b, this.a);
    }

    public final void l(String str) {
        this.c = aknz.a(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [algk, java.lang.Object] */
    public final akft m() {
        Object obj;
        ?? r0 = this.b;
        if (r0 != 0 && (obj = this.a) != null) {
            return new akft(r0, obj, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" future");
        }
        if (this.a == null) {
            sb.append(" key");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void n(ListenableFuture listenableFuture) {
        if (listenableFuture != null) {
            this.b = listenableFuture;
            return;
        }
        throw new NullPointerException("Null future");
    }

    public final void o(Object obj) {
        if (obj != null) {
            this.a = obj;
            return;
        }
        throw new NullPointerException("Null key");
    }

    public final MessageExtensionHeader p() {
        Object obj;
        Object obj2;
        Object obj3 = this.b;
        if (obj3 != null && (obj = this.c) != null && (obj2 = this.a) != null) {
            return new AutoValue_MessageExtensionHeader((String) obj3, (String) obj, (String) obj2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" namespace");
        }
        if (this.c == null) {
            sb.append(" name");
        }
        if (this.a == null) {
            sb.append(" value");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void q(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    public final void r(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null namespace");
    }

    public final void s(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null value");
    }

    public final IsComposingMessage u() {
        Object obj = this.c;
        if (obj != null) {
            return new AutoValue_IsComposingMessage((ajqk) obj, (Optional) this.b, (Optional) this.a);
        }
        throw new IllegalStateException("Missing required properties: state");
    }

    public final void v(Duration duration) {
        this.b = Optional.of(duration);
    }

    public final void w(ajqk ajqkVar) {
        if (ajqkVar != null) {
            this.c = ajqkVar;
            return;
        }
        throw new NullPointerException("Null state");
    }

    public final void x(Instant instant) {
        this.a = Optional.of(instant);
    }

    public final GroupNotification y() {
        Object obj = this.c;
        if (obj != null) {
            Conversation conversation = (Conversation) obj;
            AutoValue_GroupNotification autoValue_GroupNotification = new AutoValue_GroupNotification(conversation, (Optional) this.a, (Optional) this.b);
            if (aczt.n()) {
                boolean z = true;
                if (autoValue_GroupNotification.b.isPresent() && autoValue_GroupNotification.c.isPresent()) {
                    z = false;
                }
                d.t(z, "Not allowed to have both GroupInformation and GroupEvent in GroupNotification.");
            }
            return autoValue_GroupNotification;
        }
        throw new IllegalStateException("Missing required properties: conversation");
    }

    public final void z(Conversation conversation) {
        if (conversation != null) {
            this.c = conversation;
            return;
        }
        throw new NullPointerException("Null conversation");
    }

    public arbj(Integer num, Integer num2, Object obj) {
        this.b = num;
        this.c = num2;
        this.a = obj;
    }

    public arbj(char[] cArr) {
        this.b = null;
        this.c = null;
        this.a = anun.d;
    }

    public arbj(char[] cArr, byte[] bArr) {
        this.a = null;
        this.c = null;
        this.b = null;
    }

    public arbj(byte[] bArr, byte[] bArr2) {
        c("", new EnumMap(aoyb.class));
    }

    public arbj(byte[] bArr, char[] cArr, byte[] bArr2, byte[] bArr3) {
        this.b = Optional.empty();
    }

    public arbj(byte[] bArr, short[] sArr, byte[] bArr2) {
        this.a = Optional.empty();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map, java.lang.Object] */
    public arbj(asqe asqeVar) {
        this.a = asqeVar.a;
        this.b = new EnumMap((Map) asqeVar.c);
        this.c = new EnumMap((Map) asqeVar.b);
    }

    public arbj(byte[] bArr, char[] cArr, char[] cArr2) {
        this.c = Optional.empty();
        this.b = Optional.empty();
    }

    public arbj(short[] sArr, char[] cArr) {
        this((Integer) null, (Integer) null, (Object) null);
    }

    public arbj(FileTransferInformation fileTransferInformation) {
        this.c = Optional.empty();
        this.b = Optional.empty();
        AutoValue_FileTransferInformation autoValue_FileTransferInformation = (AutoValue_FileTransferInformation) fileTransferInformation;
        this.a = autoValue_FileTransferInformation.a;
        this.c = autoValue_FileTransferInformation.b;
        this.b = autoValue_FileTransferInformation.c;
    }

    public arbj(byte[] bArr) {
        this.c = new aqwa(null, Collections.emptyList());
        this.a = aqrm.a;
    }

    public arbj(byte[] bArr, byte[] bArr2, char[] cArr) {
        this.a = Optional.empty();
        this.b = Optional.empty();
    }

    public arbj(byte[] bArr, short[] sArr) {
        this.b = Optional.empty();
        this.a = Optional.empty();
    }
}
