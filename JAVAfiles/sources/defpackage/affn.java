package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class affn extends arpw implements arqv {
    int a;
    final /* synthetic */ affq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public affn(affq affqVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = affqVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((affn) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [armf, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        afes afeqVar;
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            if (!this.b.h()) {
                alvw g = affq.a.g();
                g.X(alwp.a, "HugoAudio");
                alvg alvgVar = (alvg) g.h("com/google/android/libraries/compose/audio/sink/FileAudioSink$prepare$2", "invokeSuspend", 68, "FileAudioSink.kt");
                affr affrVar = this.b.d;
                Uri uri = affrVar.a;
                Objects.toString(uri);
                String concat = "outputUri = ".concat(uri.toString());
                aipw aipwVar = affrVar.b;
                Objects.toString(aipwVar);
                String concat2 = "sourcePolicy = ".concat(aipwVar.toString());
                afrs afrsVar = affrVar.d;
                Objects.toString(afrsVar);
                String concat3 = "format = ".concat(afrsVar.toString());
                String str = "sampleRate = " + affrVar.e;
                String str2 = "bitRate = " + affrVar.f;
                Integer num = affrVar.g;
                Objects.toString(num);
                afes afesVar = null;
                alvgVar.t("Preparing FileAudioSink with configuration: %s", aqil.I(new String[]{concat, concat2, concat3, str, "channelCount = 1", str2, "maxFileSize = ".concat(String.valueOf(num))}, null, 63));
                affq affqVar = this.b;
                afrs afrsVar2 = affqVar.d.d;
                if (d.F(afrsVar2, afrl.a)) {
                    affq affqVar2 = this.b;
                    affr affrVar2 = affqVar2.d;
                    afew afewVar = new afew(affrVar2.a, affrVar2.b, affrVar2.e, affrVar2.f, affrVar2.g);
                    addp addpVar = affqVar2.k;
                    arpi arpiVar = (arpi) addpVar.b.b();
                    arpiVar.getClass();
                    Context context = (Context) addpVar.a.b();
                    context.getClass();
                    afeqVar = new afev(arpiVar, context, afewVar);
                } else if (d.F(afrsVar2, afrk.a)) {
                    affq affqVar3 = this.b;
                    affr affrVar3 = affqVar3.d;
                    afer aferVar = new afer(affrVar3.a, affrVar3.b, affrVar3.e, affrVar3.f, affrVar3.g);
                    addp addpVar2 = affqVar3.l;
                    arpi arpiVar2 = (arpi) addpVar2.a.b();
                    arpiVar2.getClass();
                    Context context2 = (Context) addpVar2.b.b();
                    context2.getClass();
                    afeqVar = new afeq(arpiVar2, context2, aferVar);
                } else {
                    throw new IllegalArgumentException("Format " + this.b.d.d + " is not supported.");
                }
                affqVar.f = afeqVar;
                afes afesVar2 = this.b.f;
                if (afesVar2 == null) {
                    arro.b("encoder");
                } else {
                    afesVar = afesVar2;
                }
                this.a = 1;
                if (afesVar.d(this) == arplVar) {
                    return arplVar;
                }
            } else {
                throw new IllegalStateException("This instance has already been prepared");
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new affn(this.b, arpeVar);
    }
}
