package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aghm extends arpw implements arqv {
    int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aghm(aghe agheVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = agheVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                return ((aghm) c((aghe) obj, (arpe) obj2)).b(arnb.a);
            case 1:
                return ((aghm) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 2:
                return ((aghm) c((aghe) obj, (arpe) obj2)).b(arnb.a);
            case 3:
                return ((aghm) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 4:
                return ((aghm) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 5:
                return ((aghm) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 6:
                return ((aghm) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            default:
                return ((aghm) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
    }

    /* JADX WARN: Type inference failed for: r6v50, types: [asai, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        switch (this.c) {
            case 0:
                arpl arplVar = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj2 = this.b;
                    this.a = 1;
                    if (((aghp) obj2).g(this) == arplVar) {
                        return arplVar;
                    }
                }
                return arnb.a;
            case 1:
                arpl arplVar2 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    aghe agheVar = (aghe) this.b;
                    Uri uri = agheVar.b;
                    if (uri != null) {
                        afvc a = agheVar.a();
                        this.a = 1;
                        if (a.a(uri) == arplVar2) {
                            return arplVar2;
                        }
                    }
                }
                return arnb.a;
            case 2:
                arpl arplVar3 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj3 = this.b;
                    this.a = 1;
                    if (((aghp) obj3).g(this) == arplVar3) {
                        return arplVar3;
                    }
                }
                return arnb.a;
            case 3:
                arpl arplVar4 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    aggo aggoVar = ((aghp) this.b).g;
                    this.a = 1;
                    if (aggoVar.a(0, this) == arplVar4) {
                        return arplVar4;
                    }
                }
                return arnb.a;
            case 4:
                arpl arplVar5 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    aiim bb = ((agit) this.b).bb();
                    List y = aqjn.y(afkj.g);
                    this.a = 1;
                    obj = bb.p(y, this);
                    if (obj == arplVar5) {
                        return arplVar5;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    ((agit) this.b).aW();
                }
                return arnb.a;
            case 5:
                arpl arplVar6 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    aiim bb2 = ((agit) this.b).bb();
                    afkj afkjVar = afkj.g;
                    this.a = 1;
                    obj = bb2.t(afkjVar, this);
                    if (obj == arplVar6) {
                        return arplVar6;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    ((agit) this.b).aW();
                } else {
                    ((alvg) agit.a.g().h("com/google/android/libraries/compose/voice/ui/screen/VoiceScreen$requestAudioPermission$1", "invokeSuspend", 103, "VoiceScreen.kt")).q("Record audio permission not granted yet.");
                    Object obj4 = this.b;
                    agit.aZ((agit) obj4, R.string.record_audio_permission_description, R.string.open_settings, new acah(obj4, 20));
                }
                return arnb.a;
            case 6:
                arpl arplVar7 = arpl.a;
                if (this.a == 0) {
                    aqil.P(obj);
                    ascv ascvVar = agit.e((agit) this.b).f;
                    yzp yzpVar = new yzp(this.b, 13);
                    this.a = 1;
                    if (ascvVar.a(yzpVar, this) == arplVar7) {
                        return arplVar7;
                    }
                } else {
                    aqil.P(obj);
                }
                throw new armj();
            default:
                arpl arplVar8 = arpl.a;
                int i = this.a;
                aqil.P(obj);
                if (i == 0) {
                    ?? r6 = this.b;
                    this.a = 1;
                    if (armd.p(r6, this) == arplVar8) {
                        return arplVar8;
                    }
                }
                return arnb.a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [asai, java.lang.Object] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        switch (this.c) {
            case 0:
                return new aghm((aghp) this.b, arpeVar, 0);
            case 1:
                return new aghm((aghe) this.b, arpeVar, 1);
            case 2:
                return new aghm((aghp) this.b, arpeVar, 2, (byte[]) null);
            case 3:
                return new aghm((aghp) this.b, arpeVar, 3, (char[]) null);
            case 4:
                return new aghm((agit) this.b, arpeVar, 4);
            case 5:
                return new aghm((agit) this.b, arpeVar, 5, (byte[]) null);
            case 6:
                return new aghm((agit) this.b, arpeVar, 6, (char[]) null);
            default:
                return new aghm((asai) this.b, arpeVar, 7);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aghm(aghp aghpVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = aghpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aghm(aghp aghpVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.c = i;
        this.b = aghpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aghm(aghp aghpVar, arpe arpeVar, int i, char[] cArr) {
        super(2, arpeVar);
        this.c = i;
        this.b = aghpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aghm(agit agitVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = agitVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aghm(agit agitVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.c = i;
        this.b = agitVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aghm(agit agitVar, arpe arpeVar, int i, char[] cArr) {
        super(2, arpeVar);
        this.c = i;
        this.b = agitVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aghm(asai asaiVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = asaiVar;
    }
}
