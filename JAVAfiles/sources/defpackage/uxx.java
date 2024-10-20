package defpackage;

import android.net.Uri;
import com.google.android.gms.kids.IndividualContactRequest;
import com.google.android.gms.kids.UriWithType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uxx {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/kids/intents/TrustedContactsIntents");
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final ndi f;
    public final neh g;

    public uxx(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, ndi ndiVar, neh nehVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        ndiVar.getClass();
        nehVar.getClass();
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar4;
        this.e = armfVar5;
        this.f = ndiVar;
        this.g = nehVar;
    }

    public static final Uri b(String str) {
        Uri build = new Uri.Builder().scheme("sms").opaquePart(str).build();
        build.getClass();
        return build;
    }

    public static final IndividualContactRequest c(String str) {
        IndividualContactRequest individualContactRequest = new IndividualContactRequest();
        UriWithType uriWithType = new UriWithType();
        uriWithType.a = b(str);
        individualContactRequest.b = new UriWithType[]{uriWithType};
        return individualContactRequest;
    }

    public final Object a(String str, arpe arpeVar) {
        Object b = this.b.b();
        b.getClass();
        return arro.q((arpi) b, new lxi(this, str, (arpe) null, 5), arpeVar);
    }
}
