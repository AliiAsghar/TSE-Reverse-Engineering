package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;
import java.util.ArrayDeque;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class addp {
    public final Object a;
    public final Object b;

    public addp(Context context, acoc acocVar) {
        this.a = context;
        this.b = acocVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    public final adcn a(Conversation conversation, Message message, MessageClass messageClass, adrc adrcVar) {
        Context context = (Context) ((apxx) this.b).a;
        addj addjVar = (addj) this.a.b();
        adrcVar.getClass();
        return new adcn(context, addjVar, conversation, message, messageClass, adrcVar);
    }

    public final Object b(Uri uri, arpe arpeVar) {
        ikv ikvVar = new ikv(this, uri, (arpe) null, 8);
        afiv afivVar = (afiv) this.b;
        return arro.q(afivVar.b.b(), new afju(afivVar, ikvVar, (arpe) null, 1), arpeVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final afdg c(afcq afcqVar) {
        afem afemVar = (afem) this.a.get(afcqVar.getClass());
        if (afemVar != null) {
            apbt g = afemVar.b.g(afcqVar);
            aozy createBuilder = afdg.a.createBuilder();
            createBuilder.getClass();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            String str = afemVar.a;
            apag apagVar = createBuilder.b;
            afdg afdgVar = (afdg) apagVar;
            afdgVar.b |= 1;
            afdgVar.c = str;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            afdg afdgVar2 = (afdg) createBuilder.b;
            afdgVar2.b |= 2;
            afdgVar2.d = 1;
            aozb byteString = g.toByteString();
            byteString.getClass();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            afdg afdgVar3 = (afdg) createBuilder.b;
            afdgVar3.b |= 4;
            afdgVar3.e = byteString;
            apag s = createBuilder.s();
            s.getClass();
            return (afdg) s;
        }
        Objects.toString(afcqVar);
        throw new afeh("No AttachmentSerializer found for ".concat(afcqVar.toString()));
    }

    public addp(armf armfVar, armf armfVar2, byte[] bArr) {
        this.b = armfVar;
        this.a = armfVar2;
    }

    public addp(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public addp(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        this.b = armfVar;
        this.a = armfVar2;
    }

    public addp(armf armfVar, armf armfVar2, byte[] bArr, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public addp(armf armfVar, armf armfVar2, char[] cArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
    }

    public addp() {
        this.a = new Object();
        this.b = new ArrayDeque();
    }

    public addp(armf armfVar, armf armfVar2, char[] cArr, byte[] bArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
    }

    public addp(armf armfVar, armf armfVar2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public addp(armf armfVar, armf armfVar2, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
    }
}
