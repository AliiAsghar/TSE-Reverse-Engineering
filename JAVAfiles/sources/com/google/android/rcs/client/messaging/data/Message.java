package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.abhi;
import defpackage.aczf;
import defpackage.advq;
import defpackage.ajgk;
import defpackage.ajqn;
import defpackage.ajqo;
import defpackage.ajqp;
import defpackage.ajqq;
import defpackage.ajqy;
import defpackage.alog;
import defpackage.alzz;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class Message implements Parcelable {
    public static final Parcelable.Creator<Message> CREATOR = new ajqp(1);

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static abstract class MessageContent implements Parcelable {
        public static final Parcelable.Creator<MessageContent> CREATOR = new ajqp(0);

        public abstract ajqq a();

        public abstract ChatMessage b();

        public abstract FileTransferInformation c();

        public abstract IsComposingMessage d();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public abstract LocationInformation e();

        public abstract MessageReceipt f();

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int e = abhi.e(parcel);
            ajgk.C(parcel, 1, a());
            int ordinal = a().ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    abhi.o(parcel, 2, d(), i, false);
                }
            } else {
                abhi.o(parcel, 2, b(), i, false);
            }
            abhi.g(parcel, e);
        }
    }

    public static ajqn i() {
        ajqn ajqnVar = new ajqn(null);
        ajqnVar.g(false);
        return ajqnVar;
    }

    public abstract RcsDestinationId a();

    public abstract alog b();

    public abstract alog c();

    public abstract Optional d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract Optional e();

    public abstract Optional f();

    public abstract Optional g();

    public abstract String h();

    public final String toString() {
        return String.format("Message {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", h()), String.format("sender=%s", advq.PHONE_NUMBER.c(a())), String.format("contents=%s", advq.MESSAGE_CONTENT.b(b())), String.format("sentTime=%s", g()), String.format("receiver=%s", advq.PHONE_NUMBER.c(f())), String.format("extensionHeaders=%s", c()), String.format("dispositionNotifications=%s", d()))));
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, java.lang.Iterable] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        int i2 = 0;
        abhi.q(parcel, 1, h(), false);
        abhi.o(parcel, 2, a(), i, false);
        abhi.r(parcel, 3, b(), false);
        if (f().isPresent()) {
            abhi.o(parcel, 4, f().get(), i, false);
        }
        if (g().isPresent()) {
            ajgk.D(parcel, 6, (Instant) g().get());
        }
        abhi.r(parcel, 5, c(), false);
        if (e().isPresent()) {
            abhi.h(parcel, 7, ((Boolean) e().get()).booleanValue());
        }
        if (aczf.E() && d().isPresent()) {
            ?? r6 = d().get();
            EnumSet noneOf = EnumSet.noneOf(ajqo.class);
            alzz.aS(noneOf, r6);
            abhi.G(parcel, 8, (List) Collection.EL.stream(noneOf).map(new ajqy(i2)).collect(Collectors.toList()));
        }
        abhi.g(parcel, e);
    }
}
