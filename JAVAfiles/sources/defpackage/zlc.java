package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.ui.appsettings.RichCardsSettingsActivity;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zlc {
    public final armf a;
    public final Object b;
    public final Object c;
    public final Object d;

    public zlc(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, byte[] bArr, byte[] bArr2) {
        this.d = armfVar;
        this.c = armfVar2;
        this.b = armfVar3;
        this.a = armfVar4;
    }

    public static final aesi c(String str, int i) {
        if (i > 1) {
            str = arsd.af(str);
        }
        return new aesi(2, 2, 0, str.length());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    public final ztr a(Context context) {
        aksr aksrVar = (aksr) this.c.b();
        aksrVar.getClass();
        ahmn ahmnVar = (ahmn) this.b.b();
        context.getClass();
        return new ztr(aksrVar, ahmnVar, this.a, context);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    public final void b(boolean z) {
        xvu xvuVar = (xvu) this.b.b();
        xvuVar.c();
        xvuVar.d(new Date(((xnv) this.d.b()).f().toEpochMilli()));
        xvuVar.e(z);
    }

    public zlc(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, char[] cArr) {
        armfVar.getClass();
        this.c = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        this.a = armfVar4;
    }

    public zlc(yyz yyzVar, iew iewVar, armf armfVar, armf armfVar2) {
        yyzVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.c = yyzVar;
        this.d = iewVar;
        this.b = armfVar;
        this.a = armfVar2;
    }

    public zlc(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.d = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
        armfVar4.getClass();
        this.c = armfVar4;
    }

    public zlc(RichCardsSettingsActivity richCardsSettingsActivity, lzv lzvVar, RichCardsSettingsActivity richCardsSettingsActivity2, armf armfVar, armf armfVar2) {
        this.b = lzvVar;
        this.c = richCardsSettingsActivity2;
        this.a = armfVar2;
        this.d = richCardsSettingsActivity;
        ((ajxd) armfVar.b()).c(new zlb(this, armfVar2, 0));
    }

    public zlc(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, byte[] bArr) {
        armfVar.getClass();
        this.c = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.a = armfVar4;
    }

    public zlc(asai asaiVar, armf armfVar, xwt xwtVar, arwe arweVar) {
        asaiVar.getClass();
        armfVar.getClass();
        xwtVar.getClass();
        arweVar.getClass();
        this.b = asaiVar;
        this.a = armfVar;
        this.d = xwtVar;
        this.c = arweVar;
    }
}
