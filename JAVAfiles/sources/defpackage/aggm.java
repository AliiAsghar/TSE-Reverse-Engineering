package defpackage;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aggm extends arpw implements arqv {
    Object a;
    int b;
    final /* synthetic */ int c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aggm(MediaPlayer mediaPlayer, aggn aggnVar, int i, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.f = i2;
        this.d = mediaPlayer;
        this.e = aggnVar;
        this.c = i;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((aggm) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((aggm) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [msh, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Object obj2;
        int i = 3;
        if (this.f != 0) {
            arpl arplVar = arpl.a;
            int i2 = this.b;
            if (i2 != 0) {
                if (i2 != 1) {
                    obj2 = this.a;
                    aqil.P(obj);
                    smr q = ((rtz) ((woy) this.e).c.b()).q(((smr) obj2).x());
                    q.getClass();
                    return q;
                }
                aqil.P(obj);
            } else {
                aqil.P(obj);
                woy woyVar = (woy) this.e;
                ParticipantsTable.BindData a = woyVar.a(this.d);
                akul k = woyVar.b.k(a.O(), new wkb(a, i));
                k.getClass();
                this.b = 1;
                obj = arro.F(k, this);
                if (obj == arplVar) {
                    return arplVar;
                }
            }
            smr smrVar = (smr) obj;
            if (this.c == 9 && smrVar.l() != this.c) {
                Object obj3 = this.e;
                this.a = smrVar;
                this.b = 2;
                if (((woy) obj3).d(this) != arplVar) {
                    obj2 = smrVar;
                    smr q2 = ((rtz) ((woy) this.e).c.b()).q(((smr) obj2).x());
                    q2.getClass();
                    return q2;
                }
                return arplVar;
            }
            if (woy.g(this.d) && this.c == 0) {
                Object obj4 = this.e;
                smrVar.getClass();
                if (smrVar.l() == 9) {
                    alvw g = woy.a.g();
                    g.X(alwp.a, "BugleEmergencySOS");
                    alvg alvgVar = (alvg) g;
                    alvgVar.X(ydl.p, smrVar.x());
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/satelliteapi/conversation/EmergencyConversationOperations", "resumeEmergencyConversationIfDisabled", 218, "EmergencyConversationOperations.kt")).q("Resuming disabled emergency conversation");
                    woy woyVar2 = (woy) obj4;
                    rtz rtzVar = (rtz) woyVar2.c.b();
                    ConversationIdType x = smrVar.x();
                    sng sngVar = new sng();
                    sngVar.v(0);
                    rtzVar.U(x, sngVar);
                    smr q3 = ((rtz) woyVar2.c.b()).q(smrVar.x());
                    q3.getClass();
                    return q3;
                }
            }
            return smrVar;
        }
        arpl arplVar2 = arpl.a;
        try {
            try {
                if (this.b != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj5 = this.d;
                    Object obj6 = this.e;
                    int i3 = this.c;
                    this.a = obj5;
                    this.b = 1;
                    arvp arvpVar = new arvp(arhi.i(this), 1);
                    arvpVar.A();
                    arvpVar.d(new aggd(obj5, 2));
                    ((MediaPlayer) obj5).setOnCompletionListener(new nhk((arvo) arvpVar, 3));
                    ((MediaPlayer) obj5).setAudioAttributes(aggn.b);
                    AssetFileDescriptor openRawResourceFd = ((aggn) obj6).c.getResources().openRawResourceFd(i3);
                    try {
                        ((MediaPlayer) obj5).setDataSource(openRawResourceFd);
                        armd.i(openRawResourceFd, null);
                        ((MediaPlayer) obj5).prepare();
                        ((MediaPlayer) obj5).start();
                        if (arvpVar.l() == arplVar2) {
                            return arplVar2;
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            armd.i(openRawResourceFd, th);
                            throw th2;
                        }
                    }
                }
            } catch (Exception e) {
                ((alvg) ((alvg) aggn.a.i()).g(e).h("com/google/android/libraries/compose/voice/audioplayer/DefaultSoundEffectPlayer$play$2", "invokeSuspend", 56, "DefaultSoundEffectPlayer.kt")).q("Exception occurred while playing sound effect.");
            }
            ((MediaPlayer) this.d).release();
            return arnb.a;
        } catch (Throwable th3) {
            ((MediaPlayer) this.d).release();
            throw th3;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [msh, java.lang.Object] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        if (this.f != 0) {
            return new aggm((woy) this.e, (msh) this.d, this.c, arpeVar, 1);
        }
        Object obj2 = this.d;
        return new aggm((MediaPlayer) obj2, (aggn) this.e, this.c, arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aggm(woy woyVar, msh mshVar, int i, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.f = i2;
        this.e = woyVar;
        this.d = mshVar;
        this.c = i;
    }
}
