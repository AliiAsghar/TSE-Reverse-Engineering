package com.google.android.apps.messaging.shared.datamodel.data.common;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import defpackage.ahka;
import defpackage.alog;
import defpackage.amjk;
import defpackage.apwq;
import defpackage.atok;
import defpackage.hgj;
import defpackage.lua;
import defpackage.msh;
import defpackage.qei;
import defpackage.ruz;
import defpackage.rve;
import defpackage.rwn;
import defpackage.rwy;
import defpackage.sxt;
import defpackage.sya;
import defpackage.tqp;
import defpackage.tqr;
import defpackage.tqu;
import defpackage.voe;
import defpackage.xxw;
import j$.time.Instant;
import j$.util.Optional;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface MessageCoreData extends Parcelable, rwy {
    ruz A();

    MessageIdType B();

    MessageIdType C();

    rve D();

    rve E();

    rwn F();

    MessagePartCoreData G();

    MessagesTable.BindData I();

    sya J();

    tqp K();

    tqp L();

    tqr M();

    tqu N();

    voe O();

    xxw P();

    ahka Q();

    alog S();

    alog T();

    amjk U();

    apwq V();

    Instant X();

    Optional Y();

    Optional Z();

    int a();

    String aA();

    List aD();

    UUID aE();

    atok aF();

    void aG(String str, Object obj);

    void aH(MessagePartCoreData messagePartCoreData);

    void aI(MessagesTable.BindData bindData);

    void aJ(SelfIdentityId selfIdentityId);

    void aK(SelfIdentityId selfIdentityId);

    void aL(String str);

    void aM();

    void aN();

    void aO(Instant instant, boolean z);

    void aP(long j);

    void aQ(long j);

    void aS(long j);

    void aT(long j);

    void aU(long j);

    void aV(long j);

    void aW(long j);

    void aX(long j);

    void aY();

    void aZ(long j);

    Optional aa();

    Optional ab();

    Optional ac();

    String ad();

    String ae();

    String af();

    String ag();

    String ah();

    String ai();

    String aj();

    String ak();

    String am();

    String an();

    String ao();

    String ap();

    String aq();

    String ar();

    String at();

    String au();

    String av();

    String aw();

    String ax();

    String ay();

    String az();

    int b();

    void bA(msh mshVar);

    void bB(lua luaVar);

    void bC(int i);

    void bD(msh mshVar);

    void bE(long j);

    void bF(int i);

    void bG(String str);

    void bH(long j);

    void bI(int i);

    void bJ(atok atokVar);

    void bK(long j);

    void bL(String str, List list);

    void bM(MessagesTable.BindData bindData);

    void bN(String str);

    void bO(tqu tquVar);

    void bP();

    void bQ(MessageIdType messageIdType);

    void bR(rve rveVar);

    void bS(ConversationIdType conversationIdType, Uri uri, long j);

    void bT();

    boolean bU();

    boolean bV();

    boolean bW();

    boolean bX();

    boolean bZ();

    void ba(long j);

    void bb(long j);

    void bc(long j);

    void bd(long j);

    void be();

    void bf(rwn rwnVar);

    void bg(String str);

    void bh(xxw xxwVar);

    void bi(String str, byte[] bArr);

    void bj(apwq apwqVar);

    void bk(UUID uuid);

    void bl(amjk amjkVar);

    void bm(boolean z);

    void bn();

    void bo(boolean z);

    void bp(boolean z);

    void bq();

    void br(Uri uri);

    void bs(MessageUsageStatisticsData messageUsageStatisticsData);

    void bt(String str);

    void bu(rve rveVar);

    void bv(tqp tqpVar);

    void bw(tqp tqpVar);

    void bx(Instant instant);

    void by(int i);

    void bz(long j);

    int c();

    boolean cA();

    boolean cB();

    boolean cC();

    boolean cD();

    boolean cG();

    boolean cH();

    boolean cI();

    boolean cJ();

    boolean cK();

    boolean cL();

    boolean cM();

    boolean cN();

    boolean cO();

    boolean cP();

    boolean cQ();

    boolean cS();

    boolean cT();

    boolean cU();

    byte[] cV();

    void cX(sxt sxtVar);

    hgj cZ();

    boolean cb();

    boolean cc();

    boolean cd();

    boolean ce();

    boolean cf();

    boolean cg();

    boolean ch();

    boolean ci();

    boolean ck();

    boolean cl();

    boolean cm();

    boolean cn();

    boolean co();

    boolean cp();

    boolean cq();

    boolean cr();

    boolean cs();

    boolean ct(long j);

    boolean cu(long j);

    boolean cv();

    boolean cw();

    boolean cz();

    int d();

    int f();

    int g();

    int h();

    int i();

    int j();

    long k();

    long l();

    long m();

    long n();

    long o();

    long p();

    long q();

    long r();

    long s();

    Uri t();

    lua u();

    SelfIdentityId v();

    qei w();

    MessageCoreData x();

    MessageUsageStatisticsData y();

    ConversationIdType z();
}
