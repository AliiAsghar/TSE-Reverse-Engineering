package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ffh extends ezg {
    private final ArrayDeque A;
    private final fda B;
    private eqn C;
    private eqn D;
    private fdp E;
    private fdp F;
    private MediaCrypto G;
    private float H;
    private eqn I;
    private boolean J;
    private float K;
    private ArrayDeque L;
    private fff M;
    private boolean N;
    private boolean O;
    private long P;
    private long Q;
    private int R;
    private int S;
    private ByteBuffer T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private int Z;
    private int aa;
    private int ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    private long af;
    private long ag;
    private boolean ah;
    private boolean ai;
    private ffg aj;
    private long ak;
    private boolean al;
    private final ffa j;
    private final ffj k;
    private final float l;
    public float m;
    public ffb n;
    public MediaFormat o;
    public ffe p;
    public boolean q;
    public boolean r;
    public ezo s;
    public ezh t;
    public qdq u;
    private final ewl v;
    private final ewl w;
    private final ewl x;
    private final few y;
    private final MediaCodec.BufferInfo z;

    public ffh(int i, ffa ffaVar, ffj ffjVar, float f) {
        super(i);
        this.j = ffaVar;
        this.k = ffjVar;
        this.l = f;
        this.v = new ewl(0);
        this.w = new ewl(0);
        this.x = new ewl(2);
        few fewVar = new few();
        this.y = fewVar;
        this.z = new MediaCodec.BufferInfo();
        this.m = 1.0f;
        this.H = 1.0f;
        this.A = new ArrayDeque();
        this.aj = ffg.a;
        fewVar.h(0);
        fewVar.d.order(ByteOrder.nativeOrder());
        this.B = new fda();
        this.K = -1.0f;
        this.Z = 0;
        this.R = -1;
        this.S = -1;
        this.Q = -9223372036854775807L;
        this.af = -9223372036854775807L;
        this.ag = -9223372036854775807L;
        this.ak = -9223372036854775807L;
        this.P = -9223372036854775807L;
        this.aa = 0;
        this.ab = 0;
        this.t = new ezh();
    }

    private final void aC() {
        this.X = false;
        this.y.eO();
        this.x.eO();
        this.W = false;
        this.q = false;
        this.B.a();
    }

    private final void aD() {
        if (this.ac) {
            this.aa = 1;
            this.ab = 3;
        } else {
            aG();
        }
    }

    private final void aE() {
        try {
            ffb ffbVar = this.n;
            dzg.h(ffbVar);
            ffbVar.h();
        } finally {
            as();
        }
    }

    private final void aF() {
        int i = this.ab;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    this.r = true;
                    ae();
                    return;
                } else {
                    aG();
                    return;
                }
            }
            aE();
            aM();
            return;
        }
        aE();
    }

    private final void aG() {
        ar();
        ao();
    }

    private final void aH() {
        this.R = -1;
        this.w.d = null;
    }

    private final void aI() {
        this.S = -1;
        this.T = null;
    }

    private final void aJ(fdp fdpVar) {
        edz.y(this.E, fdpVar);
        this.E = fdpVar;
    }

    private final void aK(ffg ffgVar) {
        this.aj = ffgVar;
        if (ffgVar.d != -9223372036854775807L) {
            this.al = true;
        }
    }

    private final void aL(fdp fdpVar) {
        edz.y(this.F, fdpVar);
        this.F = fdpVar;
    }

    private final void aM() {
        fdp fdpVar = this.F;
        dzg.g(fdpVar);
        ewg b = fdpVar.b();
        if (b instanceof fdz) {
            try {
                MediaCrypto mediaCrypto = this.G;
                dzg.g(mediaCrypto);
                mediaCrypto.setMediaDrmSession(((fdz) b).c);
            } catch (MediaCryptoException e) {
                throw g(e, this.C, 6006);
            }
        }
        aJ(this.F);
        this.aa = 0;
        this.ab = 0;
    }

    private final boolean aN() {
        if (this.S >= 0) {
            return true;
        }
        return false;
    }

    private final boolean aO() {
        boolean z;
        if (this.G == null) {
            z = true;
        } else {
            z = false;
        }
        dzg.d(z);
        fdp fdpVar = this.E;
        ewg b = fdpVar.b();
        if (fdz.a && (b instanceof fdz)) {
            int a = fdpVar.a();
            if (a != 1) {
                if (a != 4) {
                    return false;
                }
            } else {
                fdo c = fdpVar.c();
                dzg.g(c);
                throw g(c, this.C, c.a);
            }
        }
        if (b == null) {
            if (fdpVar.c() == null) {
                return false;
            }
            return true;
        }
        try {
            this.G = new MediaCrypto(((fdz) b).b, ((fdz) b).c);
            return true;
        } catch (MediaCryptoException e) {
            throw g(e, this.C, 6006);
        }
    }

    private final boolean aP(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        eqn eqnVar = this.D;
        if (eqnVar == null || !Objects.equals(eqnVar.o, "audio/opus")) {
            return true;
        }
        if (dxt.H(j, j2)) {
            return false;
        }
        return true;
    }

    private final boolean aQ(int i) {
        ewl ewlVar = this.v;
        fqu Q = Q();
        ewlVar.eO();
        int P = P(Q, this.v, i | 4);
        if (P == -5) {
            aj(Q);
            return true;
        }
        if (P == -4 && this.v.eR()) {
            this.ah = true;
            aF();
            return false;
        }
        return false;
    }

    private final boolean aR(eqn eqnVar) {
        int i = eul.a;
        if (this.n != null && this.ab != 3 && this.c != 0) {
            float f = this.H;
            dzg.g(eqnVar);
            float ah = ah(f, M());
            float f2 = this.K;
            if (f2 != ah) {
                if (ah == -1.0f) {
                    aD();
                    return false;
                }
                if (f2 != -1.0f || ah > this.l) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", ah);
                    ffb ffbVar = this.n;
                    dzg.g(ffbVar);
                    ffbVar.l(bundle);
                    this.K = ah;
                }
            }
        }
        return true;
    }

    private final void aS() {
        if (this.ac) {
            this.aa = 1;
            this.ab = 2;
        } else {
            aM();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean ay(eqn eqnVar) {
        int i = eqnVar.L;
        if (i != 0 && i != 2) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ezg, defpackage.fbd
    public void G(float f, float f2) {
        this.m = f;
        this.H = f2;
        aR(this.I);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // defpackage.fbd
    public void S(long r24, long r26) {
        /*
            Method dump skipped, instructions count: 1909
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffh.S(long, long):void");
    }

    @Override // defpackage.fbd
    public boolean T() {
        throw null;
    }

    @Override // defpackage.fbd
    public boolean U() {
        boolean c;
        if (this.C == null) {
            return false;
        }
        if (K()) {
            c = this.g;
        } else {
            fhv fhvVar = this.d;
            dzg.g(fhvVar);
            c = fhvVar.c();
        }
        if (c || aN()) {
            return true;
        }
        if (this.Q == -9223372036854775807L) {
            return false;
        }
        eN();
        if (SystemClock.elapsedRealtime() >= this.Q) {
            return false;
        }
        return true;
    }

    @Override // defpackage.fbf
    public final int V(eqn eqnVar) {
        try {
            return W(this.k, eqnVar);
        } catch (ffn e) {
            throw g(e, eqnVar, 4002);
        }
    }

    protected abstract int W(ffj ffjVar, eqn eqnVar);

    protected ezi X(ffe ffeVar, eqn eqnVar, eqn eqnVar2) {
        throw null;
    }

    protected abstract List Y(ffj ffjVar, eqn eqnVar, boolean z);

    protected void Z(ewl ewlVar) {
        throw null;
    }

    protected void aa(Exception exc) {
        throw null;
    }

    protected void ab(String str) {
        throw null;
    }

    protected void ac(eqn eqnVar, MediaFormat mediaFormat) {
        throw null;
    }

    protected abstract boolean af(long j, long j2, ffb ffbVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, eqn eqnVar);

    protected boolean ag(eqn eqnVar) {
        return false;
    }

    protected float ah(float f, eqn[] eqnVarArr) {
        throw null;
    }

    protected void ai(String str, long j, long j2) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bd, code lost:
    
        if (r3.m(r2) != false) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [fdp, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.ezi aj(defpackage.fqu r12) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffh.aj(fqu):ezi");
    }

    protected abstract gbl ak(ffe ffeVar, eqn eqnVar, MediaCrypto mediaCrypto, float f);

    /* JADX INFO: Access modifiers changed from: protected */
    public final long al() {
        return this.aj.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long am() {
        return this.aj.c;
    }

    protected ffd an(Throwable th, ffe ffeVar) {
        return new ffd(th, ffeVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't wrap try/catch for region: R(12:(43:(3:508|509|(63:511|512|513|514|59|60|61|(37:455|456|(3:493|494|(2:496|(1:498)))|458|459|460|462|463|(3:467|468|(25:473|466|99|100|101|(51:172|173|(2:365|366)|175|176|(1:178)|179|(1:181)|182|(3:184|(2:185|(3:187|(2:189|190)(2:192|(2:194|195)(2:196|(2:198|199)(2:200|(2:202|203)(2:204|(2:206|207)(2:208|209)))))|191)(1:210))|211)|212|213|(1:217)|218|(3:335|336|(41:340|(6:342|343|344|345|347|348)(1:361)|349|350|(1:352)(1:354)|353|221|222|223|(1:225)|226|227|(1:229)|230|231|(1:233)|234|(1:236)|237|238|(1:240)|241|(5:243|(1:245)|246|(1:248)|249)|250|251|(33:253|(1:255)|256|(1:258)|259|(1:261)|262|(1:264)|265|(1:267)|268|(1:270)|271|(1:273)|274|(1:276)|277|(1:279)|280|(1:282)|283|(1:285)|286|(1:288)|289|(1:291)|292|(1:294)|295|(1:297)|298|(1:300)|301)|302|303|(1:305)|306|307|308|309|310|311|312|313|314|315|316|317))|220|221|222|223|(0)|226|227|(0)|230|231|(0)|234|(0)|237|238|(0)|241|(0)|250|251|(0)|302|303|(0)|306|307|308|309|310|311|312|313|314|315|316|317)(1:103)|104|105|106|(1:167)(1:110)|111|(1:166)(1:125)|126|127|(1:129)|130|131|132|133|134|135|136|137|138|139))|465|466|99|100|101|(0)(0)|104|105|106|(1:108)|167|111|(6:113|115|117|119|121|123)|160|166|126|127|(0)|130|131|132|133|134|135|136|137|138|139)|63|64|65|66|67|68|70|71|(4:427|428|429|(3:431|432|(46:436|437|76|77|78|79|81|82|(3:398|399|(1:404))|84|85|86|87|(1:89)(1:394)|90|91|92|93|(1:97)|98|99|100|101|(0)(0)|104|105|106|(0)|167|111|(0)|160|166|126|127|(0)|130|131|132|133|134|135|136|137|138|139)))(1:73)|74|75|76|77|78|79|81|82|(0)|84|85|86|87|(0)(0)|90|91|92|93|(2:95|97)|98|99|100|101|(0)(0)|104|105|106|(0)|167|111|(0)|160|166|126|127|(0)|130|131|132|133|134|135|136|137|138|139))|78|79|81|82|(0)|84|85|86|87|(0)(0)|90|91|92|93|(0)|98|99|100|101|(0)(0)|104|105|106|(0)|167|111|(0)|160|166|126|127|(0)|130|131|132|133|134|135|136|137|138|139)|65|66|67|68|70|71|(0)(0)|74|75|76|77) */
    /* JADX WARN: Can't wrap try/catch for region: R(31:(3:508|509|(63:511|512|513|514|59|60|61|(37:455|456|(3:493|494|(2:496|(1:498)))|458|459|460|462|463|(3:467|468|(25:473|466|99|100|101|(51:172|173|(2:365|366)|175|176|(1:178)|179|(1:181)|182|(3:184|(2:185|(3:187|(2:189|190)(2:192|(2:194|195)(2:196|(2:198|199)(2:200|(2:202|203)(2:204|(2:206|207)(2:208|209)))))|191)(1:210))|211)|212|213|(1:217)|218|(3:335|336|(41:340|(6:342|343|344|345|347|348)(1:361)|349|350|(1:352)(1:354)|353|221|222|223|(1:225)|226|227|(1:229)|230|231|(1:233)|234|(1:236)|237|238|(1:240)|241|(5:243|(1:245)|246|(1:248)|249)|250|251|(33:253|(1:255)|256|(1:258)|259|(1:261)|262|(1:264)|265|(1:267)|268|(1:270)|271|(1:273)|274|(1:276)|277|(1:279)|280|(1:282)|283|(1:285)|286|(1:288)|289|(1:291)|292|(1:294)|295|(1:297)|298|(1:300)|301)|302|303|(1:305)|306|307|308|309|310|311|312|313|314|315|316|317))|220|221|222|223|(0)|226|227|(0)|230|231|(0)|234|(0)|237|238|(0)|241|(0)|250|251|(0)|302|303|(0)|306|307|308|309|310|311|312|313|314|315|316|317)(1:103)|104|105|106|(1:167)(1:110)|111|(1:166)(1:125)|126|127|(1:129)|130|131|132|133|134|135|136|137|138|139))|465|466|99|100|101|(0)(0)|104|105|106|(1:108)|167|111|(6:113|115|117|119|121|123)|160|166|126|127|(0)|130|131|132|133|134|135|136|137|138|139)|63|64|65|66|67|68|70|71|(4:427|428|429|(3:431|432|(46:436|437|76|77|78|79|81|82|(3:398|399|(1:404))|84|85|86|87|(1:89)(1:394)|90|91|92|93|(1:97)|98|99|100|101|(0)(0)|104|105|106|(0)|167|111|(0)|160|166|126|127|(0)|130|131|132|133|134|135|136|137|138|139)))(1:73)|74|75|76|77|78|79|81|82|(0)|84|85|86|87|(0)(0)|90|91|92|93|(2:95|97)|98|99|100|101|(0)(0)|104|105|106|(0)|167|111|(0)|160|166|126|127|(0)|130|131|132|133|134|135|136|137|138|139))|92|93|(0)|98|99|100|101|(0)(0)|104|105|106|(0)|167|111|(0)|160|166|126|127|(0)|130|131|132|133|134|135|136|137|138|139) */
    /* JADX WARN: Can't wrap try/catch for region: R(43:(3:508|509|(63:511|512|513|514|59|60|61|(37:455|456|(3:493|494|(2:496|(1:498)))|458|459|460|462|463|(3:467|468|(25:473|466|99|100|101|(51:172|173|(2:365|366)|175|176|(1:178)|179|(1:181)|182|(3:184|(2:185|(3:187|(2:189|190)(2:192|(2:194|195)(2:196|(2:198|199)(2:200|(2:202|203)(2:204|(2:206|207)(2:208|209)))))|191)(1:210))|211)|212|213|(1:217)|218|(3:335|336|(41:340|(6:342|343|344|345|347|348)(1:361)|349|350|(1:352)(1:354)|353|221|222|223|(1:225)|226|227|(1:229)|230|231|(1:233)|234|(1:236)|237|238|(1:240)|241|(5:243|(1:245)|246|(1:248)|249)|250|251|(33:253|(1:255)|256|(1:258)|259|(1:261)|262|(1:264)|265|(1:267)|268|(1:270)|271|(1:273)|274|(1:276)|277|(1:279)|280|(1:282)|283|(1:285)|286|(1:288)|289|(1:291)|292|(1:294)|295|(1:297)|298|(1:300)|301)|302|303|(1:305)|306|307|308|309|310|311|312|313|314|315|316|317))|220|221|222|223|(0)|226|227|(0)|230|231|(0)|234|(0)|237|238|(0)|241|(0)|250|251|(0)|302|303|(0)|306|307|308|309|310|311|312|313|314|315|316|317)(1:103)|104|105|106|(1:167)(1:110)|111|(1:166)(1:125)|126|127|(1:129)|130|131|132|133|134|135|136|137|138|139))|465|466|99|100|101|(0)(0)|104|105|106|(1:108)|167|111|(6:113|115|117|119|121|123)|160|166|126|127|(0)|130|131|132|133|134|135|136|137|138|139)|63|64|65|66|67|68|70|71|(4:427|428|429|(3:431|432|(46:436|437|76|77|78|79|81|82|(3:398|399|(1:404))|84|85|86|87|(1:89)(1:394)|90|91|92|93|(1:97)|98|99|100|101|(0)(0)|104|105|106|(0)|167|111|(0)|160|166|126|127|(0)|130|131|132|133|134|135|136|137|138|139)))(1:73)|74|75|76|77|78|79|81|82|(0)|84|85|86|87|(0)(0)|90|91|92|93|(2:95|97)|98|99|100|101|(0)(0)|104|105|106|(0)|167|111|(0)|160|166|126|127|(0)|130|131|132|133|134|135|136|137|138|139))|78|79|81|82|(0)|84|85|86|87|(0)(0)|90|91|92|93|(0)|98|99|100|101|(0)(0)|104|105|106|(0)|167|111|(0)|160|166|126|127|(0)|130|131|132|133|134|135|136|137|138|139) */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x07d0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x07ef, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x075d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x075e, code lost:
    
        r11 = r4;
        r12 = r20;
        r14 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0765, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0766, code lost:
    
        r11 = r4;
        r12 = r20;
        r14 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x076c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x076d, code lost:
    
        r25 = r8;
        r12 = r20;
        r14 = r22;
        r11 = r27;
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x02f9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x02fa, code lost:
    
        r27 = r3;
        r25 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0306, code lost:
    
        r24 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x02f5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x02f6, code lost:
    
        r27 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0327, code lost:
    
        r24 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x02ff, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0300, code lost:
    
        r27 = r3;
        r25 = r5;
        r23 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x030b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x030c, code lost:
    
        r27 = r3;
        r23 = r9;
        r24 = r12;
        r1 = r0;
        r15 = null;
        r25 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x06c6 A[Catch: Exception -> 0x06d0, TRY_ENTER, TRY_LEAVE, TryCatch #41 {Exception -> 0x06d0, blocks: (B:317:0x068c, B:108:0x06c6, B:113:0x06db, B:115:0x06e3, B:117:0x06eb, B:119:0x06f3, B:121:0x06fb, B:123:0x0703, B:129:0x0734, B:162:0x0718, B:164:0x0722), top: B:316:0x068c }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x06db A[Catch: Exception -> 0x06d0, TRY_ENTER, TryCatch #41 {Exception -> 0x06d0, blocks: (B:317:0x068c, B:108:0x06c6, B:113:0x06db, B:115:0x06e3, B:117:0x06eb, B:119:0x06f3, B:121:0x06fb, B:123:0x0703, B:129:0x0734, B:162:0x0718, B:164:0x0722), top: B:316:0x068c }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0734 A[Catch: Exception -> 0x06d0, TRY_ENTER, TRY_LEAVE, TryCatch #41 {Exception -> 0x06d0, blocks: (B:317:0x068c, B:108:0x06c6, B:113:0x06db, B:115:0x06e3, B:117:0x06eb, B:119:0x06f3, B:121:0x06fb, B:123:0x0703, B:129:0x0734, B:162:0x0718, B:164:0x0722), top: B:316:0x068c }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0825 A[Catch: fff -> 0x08a3, TryCatch #13 {fff -> 0x08a3, blocks: (B:142:0x07f0, B:144:0x0825, B:145:0x0835, B:147:0x0848, B:148:0x086b, B:153:0x087f, B:154:0x0881, B:155:0x084b, B:529:0x0882, B:532:0x0899, B:533:0x08a2), top: B:42:0x0101 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0848 A[Catch: fff -> 0x08a3, TryCatch #13 {fff -> 0x08a3, blocks: (B:142:0x07f0, B:144:0x0825, B:145:0x0835, B:147:0x0848, B:148:0x086b, B:153:0x087f, B:154:0x0881, B:155:0x084b, B:529:0x0882, B:532:0x0899, B:533:0x08a2), top: B:42:0x0101 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x087f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x084b A[Catch: fff -> 0x08a3, TryCatch #13 {fff -> 0x08a3, blocks: (B:142:0x07f0, B:144:0x0825, B:145:0x0835, B:147:0x0848, B:148:0x086b, B:153:0x087f, B:154:0x0881, B:155:0x084b, B:529:0x0882, B:532:0x0899, B:533:0x08a2), top: B:42:0x0101 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0540 A[Catch: Exception -> 0x054b, TRY_ENTER, TRY_LEAVE, TryCatch #42 {Exception -> 0x054b, blocks: (B:348:0x04f1, B:349:0x04ff, B:352:0x0507, B:353:0x0520, B:225:0x0540, B:229:0x0552, B:233:0x0561, B:236:0x056f, B:240:0x0583, B:243:0x059e, B:245:0x05ae, B:246:0x05b3, B:248:0x05b7, B:249:0x05bc, B:253:0x05c9, B:255:0x05d9, B:256:0x05de, B:258:0x05e2, B:259:0x05e7, B:261:0x05eb, B:262:0x05f0, B:264:0x05f4, B:265:0x05f9, B:267:0x05fd, B:268:0x0602, B:270:0x0606, B:271:0x060b, B:273:0x060f, B:274:0x0614, B:276:0x0618, B:277:0x061d, B:279:0x0621, B:280:0x0626, B:282:0x062a, B:283:0x062f, B:285:0x0633, B:286:0x0638, B:288:0x063c, B:289:0x0641, B:291:0x0645, B:292:0x064a, B:294:0x064e, B:295:0x0653, B:297:0x0657, B:298:0x065c, B:300:0x065f, B:301:0x0664, B:305:0x066f), top: B:347:0x04f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0552 A[Catch: Exception -> 0x054b, TRY_ENTER, TRY_LEAVE, TryCatch #42 {Exception -> 0x054b, blocks: (B:348:0x04f1, B:349:0x04ff, B:352:0x0507, B:353:0x0520, B:225:0x0540, B:229:0x0552, B:233:0x0561, B:236:0x056f, B:240:0x0583, B:243:0x059e, B:245:0x05ae, B:246:0x05b3, B:248:0x05b7, B:249:0x05bc, B:253:0x05c9, B:255:0x05d9, B:256:0x05de, B:258:0x05e2, B:259:0x05e7, B:261:0x05eb, B:262:0x05f0, B:264:0x05f4, B:265:0x05f9, B:267:0x05fd, B:268:0x0602, B:270:0x0606, B:271:0x060b, B:273:0x060f, B:274:0x0614, B:276:0x0618, B:277:0x061d, B:279:0x0621, B:280:0x0626, B:282:0x062a, B:283:0x062f, B:285:0x0633, B:286:0x0638, B:288:0x063c, B:289:0x0641, B:291:0x0645, B:292:0x064a, B:294:0x064e, B:295:0x0653, B:297:0x0657, B:298:0x065c, B:300:0x065f, B:301:0x0664, B:305:0x066f), top: B:347:0x04f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0561 A[Catch: Exception -> 0x054b, TRY_ENTER, TRY_LEAVE, TryCatch #42 {Exception -> 0x054b, blocks: (B:348:0x04f1, B:349:0x04ff, B:352:0x0507, B:353:0x0520, B:225:0x0540, B:229:0x0552, B:233:0x0561, B:236:0x056f, B:240:0x0583, B:243:0x059e, B:245:0x05ae, B:246:0x05b3, B:248:0x05b7, B:249:0x05bc, B:253:0x05c9, B:255:0x05d9, B:256:0x05de, B:258:0x05e2, B:259:0x05e7, B:261:0x05eb, B:262:0x05f0, B:264:0x05f4, B:265:0x05f9, B:267:0x05fd, B:268:0x0602, B:270:0x0606, B:271:0x060b, B:273:0x060f, B:274:0x0614, B:276:0x0618, B:277:0x061d, B:279:0x0621, B:280:0x0626, B:282:0x062a, B:283:0x062f, B:285:0x0633, B:286:0x0638, B:288:0x063c, B:289:0x0641, B:291:0x0645, B:292:0x064a, B:294:0x064e, B:295:0x0653, B:297:0x0657, B:298:0x065c, B:300:0x065f, B:301:0x0664, B:305:0x066f), top: B:347:0x04f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x056f A[Catch: Exception -> 0x054b, TRY_ENTER, TRY_LEAVE, TryCatch #42 {Exception -> 0x054b, blocks: (B:348:0x04f1, B:349:0x04ff, B:352:0x0507, B:353:0x0520, B:225:0x0540, B:229:0x0552, B:233:0x0561, B:236:0x056f, B:240:0x0583, B:243:0x059e, B:245:0x05ae, B:246:0x05b3, B:248:0x05b7, B:249:0x05bc, B:253:0x05c9, B:255:0x05d9, B:256:0x05de, B:258:0x05e2, B:259:0x05e7, B:261:0x05eb, B:262:0x05f0, B:264:0x05f4, B:265:0x05f9, B:267:0x05fd, B:268:0x0602, B:270:0x0606, B:271:0x060b, B:273:0x060f, B:274:0x0614, B:276:0x0618, B:277:0x061d, B:279:0x0621, B:280:0x0626, B:282:0x062a, B:283:0x062f, B:285:0x0633, B:286:0x0638, B:288:0x063c, B:289:0x0641, B:291:0x0645, B:292:0x064a, B:294:0x064e, B:295:0x0653, B:297:0x0657, B:298:0x065c, B:300:0x065f, B:301:0x0664, B:305:0x066f), top: B:347:0x04f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0583 A[Catch: Exception -> 0x054b, TRY_ENTER, TRY_LEAVE, TryCatch #42 {Exception -> 0x054b, blocks: (B:348:0x04f1, B:349:0x04ff, B:352:0x0507, B:353:0x0520, B:225:0x0540, B:229:0x0552, B:233:0x0561, B:236:0x056f, B:240:0x0583, B:243:0x059e, B:245:0x05ae, B:246:0x05b3, B:248:0x05b7, B:249:0x05bc, B:253:0x05c9, B:255:0x05d9, B:256:0x05de, B:258:0x05e2, B:259:0x05e7, B:261:0x05eb, B:262:0x05f0, B:264:0x05f4, B:265:0x05f9, B:267:0x05fd, B:268:0x0602, B:270:0x0606, B:271:0x060b, B:273:0x060f, B:274:0x0614, B:276:0x0618, B:277:0x061d, B:279:0x0621, B:280:0x0626, B:282:0x062a, B:283:0x062f, B:285:0x0633, B:286:0x0638, B:288:0x063c, B:289:0x0641, B:291:0x0645, B:292:0x064a, B:294:0x064e, B:295:0x0653, B:297:0x0657, B:298:0x065c, B:300:0x065f, B:301:0x0664, B:305:0x066f), top: B:347:0x04f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x059e A[Catch: Exception -> 0x054b, TRY_ENTER, TryCatch #42 {Exception -> 0x054b, blocks: (B:348:0x04f1, B:349:0x04ff, B:352:0x0507, B:353:0x0520, B:225:0x0540, B:229:0x0552, B:233:0x0561, B:236:0x056f, B:240:0x0583, B:243:0x059e, B:245:0x05ae, B:246:0x05b3, B:248:0x05b7, B:249:0x05bc, B:253:0x05c9, B:255:0x05d9, B:256:0x05de, B:258:0x05e2, B:259:0x05e7, B:261:0x05eb, B:262:0x05f0, B:264:0x05f4, B:265:0x05f9, B:267:0x05fd, B:268:0x0602, B:270:0x0606, B:271:0x060b, B:273:0x060f, B:274:0x0614, B:276:0x0618, B:277:0x061d, B:279:0x0621, B:280:0x0626, B:282:0x062a, B:283:0x062f, B:285:0x0633, B:286:0x0638, B:288:0x063c, B:289:0x0641, B:291:0x0645, B:292:0x064a, B:294:0x064e, B:295:0x0653, B:297:0x0657, B:298:0x065c, B:300:0x065f, B:301:0x0664, B:305:0x066f), top: B:347:0x04f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05c9 A[Catch: Exception -> 0x054b, TRY_ENTER, TryCatch #42 {Exception -> 0x054b, blocks: (B:348:0x04f1, B:349:0x04ff, B:352:0x0507, B:353:0x0520, B:225:0x0540, B:229:0x0552, B:233:0x0561, B:236:0x056f, B:240:0x0583, B:243:0x059e, B:245:0x05ae, B:246:0x05b3, B:248:0x05b7, B:249:0x05bc, B:253:0x05c9, B:255:0x05d9, B:256:0x05de, B:258:0x05e2, B:259:0x05e7, B:261:0x05eb, B:262:0x05f0, B:264:0x05f4, B:265:0x05f9, B:267:0x05fd, B:268:0x0602, B:270:0x0606, B:271:0x060b, B:273:0x060f, B:274:0x0614, B:276:0x0618, B:277:0x061d, B:279:0x0621, B:280:0x0626, B:282:0x062a, B:283:0x062f, B:285:0x0633, B:286:0x0638, B:288:0x063c, B:289:0x0641, B:291:0x0645, B:292:0x064a, B:294:0x064e, B:295:0x0653, B:297:0x0657, B:298:0x065c, B:300:0x065f, B:301:0x0664, B:305:0x066f), top: B:347:0x04f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x066f A[Catch: Exception -> 0x054b, TRY_ENTER, TRY_LEAVE, TryCatch #42 {Exception -> 0x054b, blocks: (B:348:0x04f1, B:349:0x04ff, B:352:0x0507, B:353:0x0520, B:225:0x0540, B:229:0x0552, B:233:0x0561, B:236:0x056f, B:240:0x0583, B:243:0x059e, B:245:0x05ae, B:246:0x05b3, B:248:0x05b7, B:249:0x05bc, B:253:0x05c9, B:255:0x05d9, B:256:0x05de, B:258:0x05e2, B:259:0x05e7, B:261:0x05eb, B:262:0x05f0, B:264:0x05f4, B:265:0x05f9, B:267:0x05fd, B:268:0x0602, B:270:0x0606, B:271:0x060b, B:273:0x060f, B:274:0x0614, B:276:0x0618, B:277:0x061d, B:279:0x0621, B:280:0x0626, B:282:0x062a, B:283:0x062f, B:285:0x0633, B:286:0x0638, B:288:0x063c, B:289:0x0641, B:291:0x0645, B:292:0x064a, B:294:0x064e, B:295:0x0653, B:297:0x0657, B:298:0x065c, B:300:0x065f, B:301:0x0664, B:305:0x066f), top: B:347:0x04f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x031e A[Catch: all -> 0x0377, TryCatch #36 {all -> 0x0377, blocks: (B:468:0x0366, B:470:0x036e, B:93:0x029b, B:95:0x02d0, B:97:0x02d4, B:98:0x02d9, B:382:0x031a, B:383:0x0321, B:393:0x031e), top: B:467:0x0366 }] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x025d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x01f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0103 A[Catch: fff -> 0x08a5, TryCatch #45 {fff -> 0x08a5, blocks: (B:34:0x005c, B:38:0x0087, B:41:0x00fb, B:44:0x0103, B:45:0x0108, B:47:0x010c), top: B:33:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:455:0x01a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0895  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02d0 A[Catch: Exception -> 0x02de, all -> 0x0377, TryCatch #14 {Exception -> 0x02de, blocks: (B:93:0x029b, B:95:0x02d0, B:97:0x02d4, B:98:0x02d9), top: B:92:0x029b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ao() {
        /*
            Method dump skipped, instructions count: 2227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffh.ao():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ap(long j) {
        this.ak = j;
        while (!this.A.isEmpty() && j >= ((ffg) this.A.peek()).b) {
            ffg ffgVar = (ffg) this.A.poll();
            dzg.g(ffgVar);
            aK(ffgVar);
            ad();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ar() {
        try {
            ffb ffbVar = this.n;
            if (ffbVar != null) {
                ffbVar.i();
                this.t.b++;
                ffe ffeVar = this.p;
                dzg.g(ffeVar);
                ab(ffeVar.a);
            }
            this.n = null;
            MediaCrypto mediaCrypto = this.G;
            if (mediaCrypto != null) {
                mediaCrypto.release();
            }
        } catch (Throwable th) {
            this.n = null;
            MediaCrypto mediaCrypto2 = this.G;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        } finally {
            this.G = null;
            aJ(null);
            at();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void as() {
        aH();
        aI();
        this.Q = -9223372036854775807L;
        this.ad = false;
        this.P = -9223372036854775807L;
        this.ac = false;
        this.U = false;
        this.V = false;
        this.af = -9223372036854775807L;
        this.ag = -9223372036854775807L;
        this.ak = -9223372036854775807L;
        this.aa = 0;
        this.ab = 0;
        this.Z = this.Y ? 1 : 0;
    }

    protected final void at() {
        as();
        this.s = null;
        this.L = null;
        this.p = null;
        this.I = null;
        this.o = null;
        this.J = false;
        this.ae = false;
        this.K = -1.0f;
        this.N = false;
        this.O = false;
        this.Y = false;
        this.Z = 0;
    }

    protected final boolean au() {
        if (this.n == null) {
            return false;
        }
        int i = this.ab;
        if (i != 3 && (!this.N || this.ae)) {
            if (i == 2) {
                int i2 = eul.a;
                dzg.d(true);
                try {
                    aM();
                } catch (ezo e) {
                    eub.g("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    ar();
                    return true;
                }
            }
            aE();
            return false;
        }
        ar();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean av(eqn eqnVar) {
        if (this.F == null && ag(eqnVar)) {
            return true;
        }
        return false;
    }

    protected boolean aw(ffe ffeVar) {
        return true;
    }

    protected boolean ax(ewl ewlVar) {
        return false;
    }

    public final void az() {
        if (au()) {
            ao();
        }
    }

    @Override // defpackage.ezg, defpackage.fbf
    public final int d() {
        return 8;
    }

    @Override // defpackage.ezg, defpackage.fba
    public void p(int i, Object obj) {
        if (i == 11) {
            this.u = (qdq) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ezg
    public void s() {
        this.C = null;
        aK(ffg.a);
        this.A.clear();
        au();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ezg
    public void t(boolean z, boolean z2) {
        this.t = new ezh();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ezg
    public void u(long j, boolean z) {
        this.ah = false;
        this.r = false;
        if (this.q) {
            this.y.eO();
            this.x.eO();
            this.W = false;
            this.B.a();
        } else {
            az();
        }
        fxg fxgVar = this.aj.e;
        if (fxgVar.d() > 0) {
            this.ai = true;
        }
        fxgVar.i();
        this.A.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ezg
    public void w() {
        try {
            aC();
            ar();
        } finally {
            aL(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r5 >= r1) goto L14;
     */
    @Override // defpackage.ezg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z(defpackage.eqn[] r13, long r14, long r16, defpackage.fgv r18) {
        /*
            r12 = this;
            r0 = r12
            ffg r1 = r0.aj
            long r1 = r1.d
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            ffg r1 = new ffg
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.aK(r1)
            return
        L20:
            java.util.ArrayDeque r1 = r0.A
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L55
            long r1 = r0.af
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L38
            long r5 = r0.ak
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L55
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L55
        L38:
            ffg r1 = new ffg
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.aK(r1)
            ffg r1 = r0.aj
            long r1 = r1.d
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L54
            r12.ad()
        L54:
            return
        L55:
            java.util.ArrayDeque r1 = r0.A
            ffg r9 = new ffg
            long r3 = r0.af
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffh.z(eqn[], long, long, fgv):void");
    }

    protected void aA() {
    }

    protected void aB() {
    }

    protected void ad() {
    }

    protected void ae() {
    }

    protected void aq(eqn eqnVar) {
    }
}
