
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import com.example.nychighschools.data.model.School

@Composable
fun SchoolListItem(school: School, onItemClick: (School) -> Unit) {
    Column(
        modifier = Modifier.clickable { onItemClick(school) }
    ) {
        Text(
            text = "School Name: ${school.schoolName}",
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            text = "DBN: ${school.dbn}",
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}
