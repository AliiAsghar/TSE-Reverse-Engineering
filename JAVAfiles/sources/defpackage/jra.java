package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import j$.time.Duration;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jra extends arpw implements arqw {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jra(arpe arpeVar, agje agjeVar, agip agipVar, int i) {
        super(3, arpeVar);
        this.f = i;
        this.d = agjeVar;
        this.c = agipVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                jra jraVar = new jra((arpe) obj3, (agje) this.d, (agip) this.c, 2);
                jraVar.e = (asaj) obj;
                jraVar.b = (Object[]) obj2;
                return jraVar.b(arnb.a);
            }
            jra jraVar2 = new jra((arpe) obj3, (jfm) this.c, (ConversationId) this.d, 1);
            jraVar2.e = (asaj) obj;
            jraVar2.b = obj2;
            return jraVar2.b(arnb.a);
        }
        jra jraVar3 = new jra((arpe) obj3, (jly) this.c, (jre) this.d, 0);
        jraVar3.e = (asaj) obj;
        jraVar3.b = obj2;
        return jraVar3.b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [asaj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [asaj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [asaj, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        asai jdnVar;
        asai aghwVar;
        Object obj2;
        float f;
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                arpl arplVar = arpl.a;
                int i2 = this.a;
                aqil.P(obj);
                if (i2 == 0) {
                    ?? r4 = this.e;
                    Object[] objArr = (Object[]) this.b;
                    Object obj3 = objArr[0];
                    obj3.getClass();
                    agir agirVar = (agir) obj3;
                    Object obj4 = objArr[1];
                    obj4.getClass();
                    Duration duration = (Duration) obj4;
                    aftn aftnVar = (aftn) objArr[2];
                    Float f2 = (Float) objArr[3];
                    Object obj5 = objArr[4];
                    obj5.getClass();
                    Duration duration2 = (Duration) obj5;
                    Object obj6 = objArr[5];
                    obj6.getClass();
                    boolean booleanValue = ((Boolean) obj6).booleanValue();
                    Object obj7 = objArr[6];
                    obj7.getClass();
                    agjc agjcVar = new agjc(agirVar, duration, aftnVar, f2, duration2, booleanValue, (aggp) obj7);
                    agir agirVar2 = agjcVar.a;
                    Duration duration3 = agjcVar.b;
                    aftn aftnVar2 = agjcVar.c;
                    Float f3 = agjcVar.d;
                    Duration duration4 = agjcVar.e;
                    boolean z = agjcVar.f;
                    aggp aggpVar = agjcVar.g;
                    int ordinal = agirVar2.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                if (aftnVar2 == null) {
                                    obj2 = new agji(duration3, (Duration) ((agip) this.c).b.a());
                                } else {
                                    if (!z) {
                                        if (((agip) this.c).l) {
                                            try {
                                                aggi aggiVar = ((agje) this.d).b;
                                                Uri parse = Uri.parse(aftnVar2.b);
                                                parse.getClass();
                                                aggiVar.d(parse, ((agip) this.c).i);
                                            } catch (IOException e) {
                                                ((alvg) ((alvg) agje.a.i()).g(e).h("com/google/android/libraries/compose/voice/ui/screen/VoiceUiAdapter$createUiDataFlow$$inlined$combine$1$3", "invokeSuspend", 139, "VoiceUiAdapter.kt")).D("Unable to prepare playback. url: %s, duration: %s", aftnVar2.b, aftnVar2.e);
                                                afzv.f(((agje) this.d).c, R.string.playback_preparation_failed_message);
                                            }
                                        } else {
                                            Object obj8 = this.d;
                                            Uri parse2 = Uri.parse(aftnVar2.b);
                                            parse2.getClass();
                                            ((agje) obj8).b.d(parse2, ((agip) this.c).i);
                                        }
                                    }
                                    Duration duration5 = aftnVar2.e;
                                    Object obj9 = this.d;
                                    if (f3 != null) {
                                        f = f3.floatValue();
                                    } else if (duration5.toMillis() > 0) {
                                        f = ((float) duration4.toMillis()) / ((float) duration5.toMillis());
                                    } else {
                                        f = brg.a;
                                    }
                                    float f4 = f;
                                    Duration duration6 = aftnVar2.e;
                                    if (f3 != null) {
                                        duration4 = Duration.ofMillis(f3.floatValue() * ((float) duration6.toMillis()));
                                    }
                                    Duration duration7 = duration4;
                                    aggi aggiVar2 = ((agje) obj9).b;
                                    duration7.getClass();
                                    Object obj10 = this.d;
                                    aggk aggkVar = (aggk) aggiVar2;
                                    obj2 = new agjg(duration5, aggkVar.e, aggkVar.f, duration7, f4, ((agje) obj10).h, aggpVar, new aggd(obj10, 6));
                                }
                            } else {
                                throw new armm();
                            }
                        } else {
                            ((agje) this.d).b.c(((agip) this.c).i);
                            obj2 = new agji(duration3, (Duration) ((agip) this.c).b.a());
                        }
                    } else {
                        obj2 = agjh.a;
                    }
                    this.a = 1;
                    if (r4.fv(obj2, this) == arplVar) {
                        return arplVar;
                    }
                }
                return arnb.a;
            }
            arpl arplVar2 = arpl.a;
            if (this.a != 0) {
                aqil.P(obj);
            } else {
                aqil.P(obj);
                ?? r2 = this.e;
                if (((Boolean) this.b).booleanValue()) {
                    aghwVar = ((jfi) ((jfm) this.c).a).c;
                } else if (this.d instanceof RbmConversationId) {
                    aghwVar = ((jfl) ((jfm) this.c).b).c;
                } else {
                    aghwVar = new aghw(null, 9);
                }
                this.a = 1;
                if (armd.r(r2, aghwVar, this) == arplVar2) {
                    return arplVar2;
                }
            }
            return arnb.a;
        }
        arpl arplVar3 = arpl.a;
        if (this.a != 0) {
            aqil.P(obj);
        } else {
            aqil.P(obj);
            ?? r6 = this.e;
            jqz jqzVar = (jqz) this.b;
            if (jqzVar == null) {
                jdnVar = new aghw(null, 9);
            } else {
                alvw d = jre.a.d();
                d.X(alwp.a, "BugleComposeRow2");
                ((alvg) d.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/info/DraftInfoUiAdapterImpl$special$$inlined$flatMapLatest$1", "invokeSuspend", 69, "DraftInfoUiAdapterImpl.kt")).G("DraftInfoUiAdapterImpl useInfoTooltip: %b, maxMessageSizeBytes: %d", jqzVar.a, jqzVar.b);
                if (!jqzVar.a) {
                    jdnVar = new aghw(null, 9);
                } else {
                    jdnVar = new jdn(((jly) this.c).e, this.d, jqzVar, 5, null);
                }
            }
            this.a = 1;
            if (armd.r(r6, jdnVar, this) == arplVar3) {
                return arplVar3;
            }
        }
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jra(arpe arpeVar, jfm jfmVar, ConversationId conversationId, int i) {
        super(3, arpeVar);
        this.f = i;
        this.c = jfmVar;
        this.d = conversationId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jra(arpe arpeVar, jly jlyVar, jre jreVar, int i) {
        super(3, arpeVar);
        this.f = i;
        this.c = jlyVar;
        this.d = jreVar;
    }
}
