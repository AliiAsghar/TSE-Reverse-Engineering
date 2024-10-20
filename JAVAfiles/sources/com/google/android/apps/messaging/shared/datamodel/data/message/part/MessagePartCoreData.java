package com.google.android.apps.messaging.shared.datamodel.data.message.part;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import defpackage.afvq;
import defpackage.aggp;
import defpackage.ameb;
import defpackage.amoq;
import defpackage.rwx;
import defpackage.rwz;
import defpackage.tqd;
import defpackage.tqi;
import defpackage.tqj;
import defpackage.tql;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface MessagePartCoreData extends Parcelable, rwz {
    MessageIdType A();

    rwx B();

    MessagePartCoreData C();

    PartsTable.BindData D();

    VmtTable.BindData E();

    tqd F();

    tqi G();

    tqj H();

    tql I();

    LocationInformation J();

    afvq K();

    aggp L();

    ameb M();

    amoq N();

    String O();

    String P();

    String Q();

    String R();

    String S();

    String T();

    String V();

    String W();

    String X();

    String Y();

    String Z();

    int a();

    void aA(afvq afvqVar);

    void aB(Uri uri);

    void aC(Uri uri);

    void aD(long j);

    void aE(tql tqlVar);

    void aF(long j);

    void aG(String str);

    void aH(aggp aggpVar);

    void aI(VmtTable.BindData bindData);

    void aJ(Context context);

    void aK(PartsTable.BindData bindData);

    void aL(ConversationIdType conversationIdType);

    void aM(MessageIdType messageIdType);

    void aN(String str);

    void aO(MessagePartCoreData messagePartCoreData);

    boolean aP();

    boolean aQ();

    boolean aR();

    boolean aS();

    boolean aT();

    boolean aU();

    boolean aW();

    boolean aX();

    boolean aY();

    boolean aZ();

    String aa();

    String ab();

    String ac();

    String ad();

    void ae();

    void af();

    void ag();

    void aj();

    void ak();

    void al(amoq amoqVar);

    void am(String str);

    void an(long j);

    void ao(String str);

    void ap(long j);

    void aq(byte[] bArr);

    void ar(String str);

    void as(Uri uri);

    void at(ConversationIdType conversationIdType);

    void au(long j);

    void av(String str);

    void aw(Uri uri);

    void ax(String str);

    void ay(byte[] bArr);

    void az(tqj tqjVar);

    boolean bC(Uri uri);

    boolean bD(MessagePartCoreData messagePartCoreData);

    byte[] bE();

    byte[] bF();

    void bH();

    void bI();

    int bJ();

    long bK();

    boolean ba();

    boolean bb();

    boolean bc();

    boolean bd();

    boolean be();

    boolean bf();

    boolean bg();

    boolean bh();

    boolean bi();

    boolean bj();

    boolean bl();

    boolean bm();

    boolean bn();

    boolean bo();

    boolean bp();

    boolean bq();

    boolean br();

    boolean bs();

    boolean bu();

    boolean bv();

    boolean bw();

    boolean bx();

    boolean by();

    boolean bz();

    long d();

    long j();

    long k();

    long l();

    long m();

    long n();

    long o();

    long p();

    long q();

    ContentValues r();

    Rect s();

    Uri u();

    Uri v();

    Uri w();

    Uri x();

    ConversationIdType z();
}
