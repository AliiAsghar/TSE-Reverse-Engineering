package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vtc implements Supplier {
    private final /* synthetic */ int a;

    public /* synthetic */ vtc(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        agmh agmhVar;
        agmh agmhVar2;
        switch (this.a) {
            case 0:
                return amfv.a.createBuilder();
            case 1:
                return new IllegalStateException("senderMessagingIdentity expected");
            case 2:
                throw new IllegalArgumentException("Conversation not found");
            case 3:
                return new IllegalStateException("Sender is absent");
            case 4:
                return new IllegalStateException("Sender is absent");
            case 5:
                return new ArrayList();
            case 6:
                return new IllegalArgumentException("RCS self identity is not present.");
            case 7:
                return new IllegalArgumentException("RCS self identity is not present.");
            case 8:
                return new IllegalArgumentException("RCS self identity is not present.");
            case 9:
                return new wer();
            case 10:
                return new ArrayList();
            case 11:
                return new whd();
            case 12:
                return new whq();
            case 13:
                return new wif();
            case 14:
                alvi alviVar = wiv.a;
                return null;
            case 15:
                throw new IllegalStateException("RCS Provisioning Id should not be empty");
            case 16:
                throw new IllegalStateException("RCS Provisioning Id should not be empty");
            case 17:
                return new NoSuchElementException("SimId should always be present in AvailabilityUpdate.");
            case 18:
                return new ArrayList();
            case 19:
                agmhVar = MessagesTable.c.a;
                return agmhVar;
            default:
                agmhVar2 = MessagesTable.c.a;
                return agmhVar2;
        }
    }
}
