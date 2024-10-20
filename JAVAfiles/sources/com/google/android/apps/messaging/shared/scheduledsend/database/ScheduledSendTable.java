package com.google.android.apps.messaging.shared.scheduledsend.database;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.a;
import defpackage.aday;
import defpackage.aglo;
import defpackage.aglz;
import defpackage.agma;
import defpackage.agmq;
import defpackage.agnc;
import defpackage.agnw;
import defpackage.akec;
import defpackage.alob;
import defpackage.alok;
import defpackage.alor;
import defpackage.ruy;
import defpackage.rvc;
import defpackage.sdr;
import defpackage.uea;
import defpackage.uzz;
import defpackage.wso;
import defpackage.wsx;
import defpackage.wsz;
import defpackage.wta;
import defpackage.wtb;
import defpackage.wtc;
import defpackage.wtf;
import defpackage.wxx;
import defpackage.wyp;
import j$.time.Instant;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ScheduledSendTable extends aglo {
    public static final String[] a = {"scheduled_send._id", "scheduled_send.message_id", "scheduled_send.conversation_id", "scheduled_send.scheduled_time", "scheduled_send.status", "scheduled_send.creation_time"};
    public static final alor b;
    public static final int[] c;
    public static final wyp d;

    static {
        alok alokVar = new alok();
        alokVar.h("scheduled_send.creation_time", 58020);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("conversation_id", "index_scheduled_send_conversation_id");
        alokVar2.b();
        d = new wyp();
        c = new int[]{52040, 58020, 58170, 58290};
    }

    public static wsx a() {
        int i = wso.a;
        wsx wsxVar = new wsx();
        wsxVar.aD();
        return wsxVar;
    }

    public static final wtc b() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("scheduled_send._id");
            alobVar.h("scheduled_send.message_id");
            alobVar.h("scheduled_send.conversation_id");
            alobVar.h("scheduled_send.scheduled_time");
            alobVar.h("scheduled_send.status");
            if (valueOf.intValue() >= 58020) {
                alobVar.h("scheduled_send.creation_time");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new wtc(strArr);
    }

    public static void c(agnw agnwVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER UNIQUE REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("scheduled_time INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("status INTEGER DEFAULT(0)");
        if (i >= 58020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("creation_time INTEGER DEFAULT(0) NOT NULL");
        }
        sb.insert(0, "CREATE TABLE scheduled_send (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 58170) {
            arrayList.add("DROP INDEX IF EXISTS index_scheduled_send_conversation_id");
            arrayList.add("CREATE INDEX index_scheduled_send_conversation_id ON scheduled_send(conversation_id);");
        }
        if (i >= 58290) {
            arrayList.add("DROP INDEX IF EXISTS index_status_time");
            arrayList.add("CREATE INDEX index_status_time ON scheduled_send(status, scheduled_time);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public static abstract class BindData extends aglz<wta, wtb, wtc, BindData, wsz> implements Parcelable, agma {
        public static final Parcelable.Creator<BindData> CREATOR = new sdr(13);
        public String a;
        public MessageIdType b = rvc.a;
        public ConversationIdType c = ruy.a;
        public Instant d = uzz.l(0);
        public wtf e = wtf.SCHEDULED;
        public Instant f = uzz.l(0);

        /* JADX INFO: Access modifiers changed from: protected */
        public BindData() {
        }

        @Override // defpackage.aglz
        public final String a() {
            return String.format(Locale.US, "ScheduledSendTable [_id: %s,\n  message_id: %s,\n  conversation_id: %s,\n  scheduled_time: %s,\n  status: %s,\n  creation_time: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
        }

        @Override // defpackage.aglz
        public final void b(ContentValues contentValues) {
            Integer valueOf;
            valueOf = Integer.valueOf(a.bp().c());
            int intValue = valueOf.intValue();
            MessageIdType messageIdType = this.b;
            if (messageIdType != null && !messageIdType.equals(rvc.a)) {
                contentValues.put("message_id", Long.valueOf(rvc.a(this.b)));
            } else {
                contentValues.putNull("message_id");
            }
            ConversationIdType conversationIdType = this.c;
            if (conversationIdType != null && !conversationIdType.equals(ruy.a)) {
                contentValues.put("conversation_id", Long.valueOf(ruy.a(this.c)));
            } else {
                contentValues.putNull("conversation_id");
            }
            Instant instant = this.d;
            if (instant == null) {
                contentValues.putNull("scheduled_time");
            } else {
                contentValues.put("scheduled_time", Long.valueOf(uzz.k(instant)));
            }
            wtf wtfVar = this.e;
            if (wtfVar == null) {
                contentValues.putNull("status");
            } else {
                contentValues.put("status", Integer.valueOf(wtfVar.ordinal()));
            }
            if (intValue >= 58020) {
                Instant instant2 = this.f;
                if (instant2 == null) {
                    contentValues.putNull("creation_time");
                } else {
                    contentValues.put("creation_time", Long.valueOf(uzz.k(instant2)));
                }
            }
        }

        @Override // defpackage.aglz
        public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
            wta wtaVar = (wta) agmqVar;
            aq();
            this.cJ = wtaVar.dx();
            if (wtaVar.db(0)) {
                this.a = wtaVar.i();
                fE(0);
            }
            if (wtaVar.db(1)) {
                this.b = wtaVar.e();
                fE(1);
            }
            if (wtaVar.db(2)) {
                this.c = wtaVar.c();
                fE(2);
            }
            if (wtaVar.db(3)) {
                this.d = wtaVar.h();
                fE(3);
            }
            if (wtaVar.db(4)) {
                this.e = wtaVar.f();
                fE(4);
            }
            if (wtaVar.db(5)) {
                this.f = wtaVar.g();
                fE(5);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BindData)) {
                return false;
            }
            BindData bindData = (BindData) obj;
            if (super.aC(bindData.cJ) && Objects.equals(this.a, bindData.a) && Objects.equals(this.b, bindData.b) && Objects.equals(this.c, bindData.c) && Objects.equals(this.d, bindData.d) && this.e == bindData.e && Objects.equals(this.f, bindData.f)) {
                return true;
            }
            return false;
        }

        @Override // defpackage.agma
        public final String f() {
            return String.format(Locale.US, "INTO %s (%s) VALUES ", "scheduled_send", agnc.j(new String[]{"message_id", "conversation_id", "scheduled_time", "status", "creation_time"}));
        }

        @Override // defpackage.aglz
        protected final void fo(Parcel parcel) {
            this.a = parcel.readString();
            this.b = new MessageIdType(parcel.readLong());
            this.c = new ConversationIdType(parcel.readLong());
            this.d = uzz.l(parcel.readLong());
            wtf[] values = wtf.values();
            int readInt = parcel.readInt();
            if (readInt >= 0) {
                if (readInt < values.length) {
                    this.e = values[readInt];
                } else {
                    throw new IllegalArgumentException();
                }
            }
            this.f = uzz.l(parcel.readLong());
        }

        @Override // defpackage.aglz
        protected final void fp(Parcel parcel) {
            int ordinal;
            parcel.writeString(this.a);
            parcel.writeLong(rvc.a(this.b));
            parcel.writeLong(ruy.a(this.c));
            parcel.writeLong(uzz.k(this.d));
            wtf wtfVar = this.e;
            if (wtfVar == null) {
                ordinal = -1;
            } else {
                ordinal = wtfVar.ordinal();
            }
            parcel.writeInt(ordinal);
            parcel.writeLong(uzz.k(this.f));
        }

        @Override // defpackage.agma
        public final String g() {
            return "_id";
        }

        public final int hashCode() {
            aday adayVar;
            int ordinal;
            aday adayVar2 = this.cJ;
            if (adayVar2 != null && !adayVar2.Y()) {
                adayVar = this.cJ;
            } else {
                adayVar = null;
            }
            String str = this.a;
            MessageIdType messageIdType = this.b;
            ConversationIdType conversationIdType = this.c;
            Instant instant = this.d;
            wtf wtfVar = this.e;
            if (wtfVar == null) {
                ordinal = 0;
            } else {
                ordinal = wtfVar.ordinal();
            }
            return Objects.hash(adayVar, str, messageIdType, conversationIdType, instant, Integer.valueOf(ordinal), this.f, null);
        }

        @Override // defpackage.agma
        public final String i() {
            return "scheduled_send";
        }

        @Override // defpackage.agma
        public final void j(StringBuilder sb, List list) {
            Object valueOf;
            Object obj = new uea(this, 20).get();
            Object obj2 = new wxx((aglz) this, 1).get();
            Long valueOf2 = Long.valueOf(uzz.k(this.d));
            wtf wtfVar = this.e;
            if (wtfVar == null) {
                valueOf = 0;
            } else {
                valueOf = String.valueOf(wtfVar.ordinal());
            }
            Object[] objArr = {obj, obj2, valueOf2, valueOf, Long.valueOf(uzz.k(this.f))};
            sb.append('(');
            for (int i = 0; i < 5; i++) {
                Object obj3 = objArr[i];
                if (obj3 instanceof Number) {
                    sb.append(String.valueOf(obj3));
                } else {
                    if (obj3 instanceof String) {
                        String str = (String) obj3;
                        if (str.length() < 12) {
                            sb.append(DatabaseUtils.sqlEscapeString(str));
                        }
                    }
                    list.add(obj3);
                    sb.append('?');
                }
                sb.append(',');
            }
            sb.setLength(sb.length() - 1);
            sb.append(')');
        }

        public final String toString() {
            if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
                return String.format(Locale.US, "%s", "ScheduledSendTable -- REDACTED");
            }
            return a();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public BindData(Parcel parcel) {
            ap(parcel);
        }
    }
}
