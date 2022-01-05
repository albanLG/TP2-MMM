package data;

import static android.content.ContentValues.TAG;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IRepositoryFirebase implements IRepository {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("Clients");

    @Override
    public void insertClient(Client client) {

    }

    @Override
    public void deleteClient(Client client) {

    }

    @Override
    public void deleteAllClients() {

    }

    @Override
    public LiveData<List<Client>> getAllClients() {
        return null;
    }
}
